package spo.cleaning.partners.app.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The class which represents the Structure configuration.
 * 
 * @author nsanzfia
 *
 */
@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class StructureConfiguration implements Serializable {

	/**
	 * Number of seniors in this configuration.
	 */
	@JsonProperty("senior")
	private int seniorsNumber;

	/**
	 * The number of juniors in this configuration.
	 */
	@JsonProperty("junior")
	private int juniorsNumber;

	public StructureConfiguration() {
		super();
	}
	
	public StructureConfiguration(int seniorsNumber, int juniorsNumber) {
		super();
		this.seniorsNumber = seniorsNumber;
		this.juniorsNumber = juniorsNumber;
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
