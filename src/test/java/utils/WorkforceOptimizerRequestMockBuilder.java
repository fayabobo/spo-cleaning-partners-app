package utils;

import java.util.ArrayList;
import java.util.List;

import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;

/**
 * An utility class for the creation of some WorkforceOptimizerRequest mocks.
 * 
 * @author nsanzfia
 *
 */
public final class WorkforceOptimizerRequestMockBuilder {

	private WorkforceOptimizerRequestMockBuilder() {
		// Private constructor to avoid the initialisation of this class.
	}

	/**
	 * Builds a WorkforceOptimizerRequest
	 * 
	 * @return WorkforceOptimizerRequest
	 * @author nsanzfia
	 */
	public static WorkforceOptimizerRequest buildWorkforceOptimizerRequestMock1() {
		WorkforceOptimizerRequest workforceOptimizerRequest = new WorkforceOptimizerRequest();
		List<Integer> listOfRoomNumbersInEachStructure = new ArrayList<>();
		listOfRoomNumbersInEachStructure.add(35);
		listOfRoomNumbersInEachStructure.add(21);
		listOfRoomNumbersInEachStructure.add(17);
		workforceOptimizerRequest.setListOfRoomNumbersInEachStructure(listOfRoomNumbersInEachStructure);
		workforceOptimizerRequest.setSeniorCapacity(10);
		workforceOptimizerRequest.setJuniorCapacity(6);
		return workforceOptimizerRequest;
	}

	/**
	 * Builds a WorkforceOptimizerRequest
	 * 
	 * @return WorkforceOptimizerRequest
	 * @author nsanzfia
	 */
	public static WorkforceOptimizerRequest buildWorkforceOptimizerRequestMock2() {
		WorkforceOptimizerRequest workforceOptimizerRequest = new WorkforceOptimizerRequest();
		List<Integer> listOfRoomNumbersInEachStructure = new ArrayList<>();
		listOfRoomNumbersInEachStructure.add(24);
		listOfRoomNumbersInEachStructure.add(28);
		workforceOptimizerRequest.setListOfRoomNumbersInEachStructure(listOfRoomNumbersInEachStructure);
		workforceOptimizerRequest.setSeniorCapacity(11);
		workforceOptimizerRequest.setJuniorCapacity(6);
		return workforceOptimizerRequest;
	}

}
