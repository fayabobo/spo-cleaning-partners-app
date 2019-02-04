package spo.cleaning.partners.app.service;

import spo.cleaning.partners.app.core.Structure;
import spo.cleaning.partners.app.core.StructureConfiguration;

/**
 * Service to build the configuration of a {@link Structure}. <br>
 * The algorithme used to resolve this question have been copied from https://github.com/skhg/spo_challenge/blob/master/StaffOptimiser/src/main/java/spo/engine/SimpleOptimiser.java. <br>
 * Thank you to skhg for sharing.
 * 
 * @author nsanzfia
 *
 */
public interface BuildStructureConfigurationService {

	/**
	 * Builds the configuration of a {@link Structure}. <br>
	 * The algorithme used to resolve this question have been copied from https://github.com/skhg/spo_challenge/blob/master/StaffOptimiser/src/main/java/spo/engine/SimpleOptimiser.java. <br>
	 * Thank you to skhg for sharing.
	 * 
	 * @author nsanzfia
	 *
	 */
	StructureConfiguration buildStructureConfiguration(int structureRoomsNumber, Integer seniorCapacity, Integer juniorCapacity);

}
