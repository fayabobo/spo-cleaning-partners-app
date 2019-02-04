package spo.cleaning.partners.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spo.cleaning.partners.app.core.StructureConfiguration;
import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.exception.InconsitentParametersException;
import spo.cleaning.partners.app.service.OptimizeWorkforceService;

/**
 * Service to optimize the workforce.
 * 
 * @author nsanzfia
 *
 */
@Service
public class OptimizeWorkforceServiceImpl implements OptimizeWorkforceService {

	@Override
	public List<StructureConfiguration> optimizeWorkforce(final WorkforceOptimizerRequest workforceOptimizerRequest) throws InconsitentParametersException {

		if (workforceOptimizerRequest == null) {
			throw new InconsitentParametersException();
		}
		
		List<StructureConfiguration> structureConfigurations = new ArrayList<>();

		for (int structureRoomsNumber : workforceOptimizerRequest.getListOfRoomNumbersInEachStructure()) {
			structureConfigurations.add(buildStructureConfiguration(structureRoomsNumber, workforceOptimizerRequest.getSeniorCapacity(), workforceOptimizerRequest.getJuniorCapacity()));
		}

		return structureConfigurations;
	}

	private StructureConfiguration buildStructureConfiguration(final int structureRoomsNumber, final Integer seniorCapacity, final Integer juniorCapacity) {
		// Setup our starting parameters
		int startSeniors = (int) Math.ceil((double) structureRoomsNumber / (double) seniorCapacity); // What if we only used seniors to clean?
		int startJuniors = 0; // And no juniors?

		int minOffset = GreatestCommonDivisor(seniorCapacity, juniorCapacity);
		int minStepSize = Math.min(seniorCapacity, juniorCapacity);

		int[] result = exploreParams(Integer.MAX_VALUE, structureRoomsNumber, minOffset, minStepSize, seniorCapacity, juniorCapacity, startSeniors, startSeniors, startJuniors, startJuniors);
		return new StructureConfiguration(result[0], result[1]);
	}

	/**
	 * Find the greatest common divisor of two integers From https://stackoverflow.com/a/4009247/8217016
	 * 
	 * @param a any integer
	 * @param b any integer
	 * @return
	 */
	public int GreatestCommonDivisor(final int a, final int b) {
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
	 * @return
	 */
	private int[] exploreParams(final int priorDistance, final int buildingSize, final int minInterval, final int minStep, final int seniorCapacity, final int juniorCapacity, final int priorSeniors,
			final int currSeniors, final int priorJuniors, final int currJuniors) {

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
			return exploreParams(distance, buildingSize, minInterval, minStep, seniorCapacity, juniorCapacity, currSeniors, currSeniors - 1, currJuniors, currJuniors);
		}

		if (currentStaffCapacity < buildingSize) {
			// We don't have enough staff assigned so add a junior and test again
			return exploreParams(priorDistance, buildingSize, minInterval, minStep, seniorCapacity, juniorCapacity, currSeniors, currSeniors, currJuniors, currJuniors + 1);
		}

		return new int[] { currSeniors, currJuniors };
	}

}
