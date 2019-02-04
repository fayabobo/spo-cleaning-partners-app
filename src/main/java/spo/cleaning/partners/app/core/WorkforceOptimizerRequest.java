package spo.cleaning.partners.app.core;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class which represents the request to the WorkforceOptimizerController.
 * 
 * @author nsanzfia
 *
 */
@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class WorkforceOptimizerRequest implements Serializable {

	/**
	 * The list of room numbers in each structure.
	 * 
	 * @author nsanzfia
	 */
	@NotNull
	@JsonProperty("rooms")
	List<Integer> listOfRoomNumbersInEachStructure;

	/**
	 * Senior capacity.
	 * 
	 * @author nsanzfia
	 */
	@NotNull
	@JsonProperty("senior")
	Integer seniorCapacity;

	/**
	 * Junior capacity.
	 * 
	 * @author nsanzfia
	 */
	@NotNull
	@JsonProperty("junior")
	Integer juniorCapacity;

	/**
	 * Get the list of room numbers in each structure.
	 * 
	 * @return the list
	 * @author nsanzfia
	 */
	public List<Integer> getListOfRoomNumbersInEachStructure() {
		return listOfRoomNumbersInEachStructure;
	}

	/**
	 * Set the list of room numbers in each structure.
	 * 
	 * @return the list
	 * @author nsanzfia
	 */
	public void setListOfRoomNumbersInEachStructure(final List<Integer> listOfRoomNumbersInEachStructure) {
		this.listOfRoomNumbersInEachStructure = listOfRoomNumbersInEachStructure;
	}

	public Integer getSeniorCapacity() {
		return seniorCapacity;
	}

	public void setSeniorCapacity(final Integer seniorCapacity) {
		this.seniorCapacity = seniorCapacity;
	}

	public Integer getJuniorCapacity() {
		return juniorCapacity;
	}

	public void setJuniorCapacity(final Integer juniorCapacity) {
		this.juniorCapacity = juniorCapacity;
	}

}
