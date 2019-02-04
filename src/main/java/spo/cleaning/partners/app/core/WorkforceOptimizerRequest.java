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
	 * Numbers of rooms for providers.
	 * 
	 * @author nsanzfia
	 */
	@NotNull
	@JsonProperty("rooms")
	List<Integer> providersRoomsNumbers;

	/**
	 * Number of seniors.
	 * 
	 * @author nsanzfia
	 */
	@NotNull
	@JsonProperty("senior")
	int seniorsNumber;

	/**
	 * Number of juniors.
	 * 
	 * @author nsanzfia
	 */
	@NotNull
	@JsonProperty("junior")
	int juniorsNumber;

	public List<Integer> getProvidersRoomsNumbers() {
		return providersRoomsNumbers;
	}

	public void setProvidersRoomsNumbers(List<Integer> providersRoomsNumbers) {
		this.providersRoomsNumbers = providersRoomsNumbers;
	}

	public int getSeniorsNumber() {
		return seniorsNumber;
	}

	public void setSeniorsNumber(int seniorsNumber) {
		this.seniorsNumber = seniorsNumber;
	}

	public int getJuniorsNumber() {
		return juniorsNumber;
	}

	public void setJuniorsNumber(int juniorsNumber) {
		this.juniorsNumber = juniorsNumber;
	}

}
