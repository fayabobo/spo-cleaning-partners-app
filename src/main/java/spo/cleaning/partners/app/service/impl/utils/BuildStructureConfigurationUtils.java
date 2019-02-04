package spo.cleaning.partners.app.service.impl.utils;

import spo.cleaning.partners.app.core.Structure;
import spo.cleaning.partners.app.core.StructureConfiguration;

/**
 * Utility class to build the configuration of a {@link Structure}. <br>
 * The algorithm used to resolve this question have been copied from https://github.com/skhg/spo_challenge/blob/master/StaffOptimiser/src/main/java/spo/engine/SimpleOptimiser.java. <br>
 * Thank you to skhg for sharing.
 * 
 * @author nsanzfia
 *
 */
public final class BuildStructureConfigurationUtils {

	private BuildStructureConfigurationUtils() {
		// Empty method to avoid the initialization of this class.
	}

	/**
	 * Builds the configuration of a {@link Structure}. <br>
	 * The algorithm used to resolve this question have been copied from https://github.com/skhg/spo_challenge/blob/master/StaffOptimiser/src/main/java/spo/engine/SimpleOptimiser.java. <br>
	 * Thank you to skhg for sharing.
	 * 
	 * @author nsanzfia
	 *
	 */
	public static StructureConfiguration buildStructureConfiguration(final int structureRoomsNumber, final Integer seniorCapacity, final Integer juniorCapacity) {
		int seniors = (int) Math.ceil((double) structureRoomsNumber / (double) seniorCapacity); // What if we only used seniors to clean?
		int juniors = 0;

		int minOffset = GreatestCommonDivisor(seniorCapacity, juniorCapacity);
		int minStepSize = Math.min(seniorCapacity, juniorCapacity);

		int[] result = findOptimalConfiguration(Integer.MAX_VALUE, structureRoomsNumber, minOffset, minStepSize, seniorCapacity, juniorCapacity, seniors, seniors, juniors, juniors);
		return new StructureConfiguration(result[0], result[1]);
	}

	/**
	 * Find the greatest common divisor of two integers From https://stackoverflow.com/a/4009247/8217016
	 * 
	 * @param a any integer
	 * @param b any integer
	 * @return the greatest common divisor
	 */
	public static int GreatestCommonDivisor(final int a, final int b) {
		if (b == 0) {
			return a;
		}
		return GreatestCommonDivisor(b, a % b);
	}

	/**
	 * Function which is called recursively to find the optimal staffing parameters.
	 * 
	 * Optimal staffing would be when the total capacity of senior + junior staff = building size
	 * 
	 * @param priorDistance  How far off optimal we were on the previous step
	 * @param buildingSize   How big is the building
	 * @param minInterval    What's the smallest interval between the combinations of junior + senior
	 * @param minStep        What's the smallest step upwards we can take
	 * @param seniorCapacity How much work can a senior staff member do
	 * @param juniorCapacity How much work can a junior staff member do
	 * @param priorSeniors   How many seniors did we assign on the previous step
	 * @param currSeniors    How many seniors are we trying on this step
	 * @param priorJuniors   How many juniors did we assign on the previous step
	 * @param currJuniors    How many juniors are we trying on this step
	 * @return the optimal configuration as an array
	 */
	private static int[] findOptimalConfiguration(final int priorDistance, final int buildingSize, final int minInterval, final int minStep, final int seniorCapacity, final int juniorCapacity,
			final int priorSeniors, final int currSeniors, final int priorJuniors, final int currJuniors) {
		// TODO to long method. Make it less than 20 lines.
		int currentStaffCapacity = (seniorCapacity * currSeniors) + (juniorCapacity * currJuniors);
		int distance = Math.abs(currentStaffCapacity - buildingSize);

		if (distance <= minInterval && currentStaffCapacity >= buildingSize) {
			// We can't take a smaller step downwards and capacity has been filled
			return new int[] { currSeniors, currJuniors }; // This is a good result
		}

		if (distance > minStep && currentStaffCapacity < buildingSize) {
			// We have taken too many steps downwards and can't get back to buildingCapacity in one step
			// So backtrack and return values from previous iteration
			return new int[] { priorSeniors, priorJuniors };
		}

		if (currentStaffCapacity > buildingSize && currSeniors > 1) {
			// We have too many staff assigned so remove a senior (if possible) and test again
			return findOptimalConfiguration(distance, buildingSize, minInterval, minStep, seniorCapacity, juniorCapacity, currSeniors, currSeniors - 1, currJuniors, currJuniors);
		}

		if (currentStaffCapacity < buildingSize) {
			// We don't have enough staff assigned so add a junior and test again
			return findOptimalConfiguration(priorDistance, buildingSize, minInterval, minStep, seniorCapacity, juniorCapacity, currSeniors, currSeniors, currJuniors, currJuniors + 1);
		}

		return new int[] { currSeniors, currJuniors };
	}

}
