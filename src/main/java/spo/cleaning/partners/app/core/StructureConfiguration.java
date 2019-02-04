package spo.cleaning.partners.app.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public StructureConfiguration(final int seniorsNumber, final int juniorsNumber) {
		super();
		this.seniorsNumber = seniorsNumber;
		this.juniorsNumber = juniorsNumber;
	}

	public int getSeniorsNumber() {
		return seniorsNumber;
	}

	public void setSeniorsNumber(final int seniorsNumber) {
		this.seniorsNumber = seniorsNumber;
	}

	public int getJuniorsNumber() {
		return juniorsNumber;
	}

	public void setJuniorsNumber(final int juniorsNumber) {
		this.juniorsNumber = juniorsNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode(). Generated automatically.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + juniorsNumber;
		result = prime * result + seniorsNumber;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object). Generated automatically.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StructureConfiguration other = (StructureConfiguration) obj;
		if (juniorsNumber != other.juniorsNumber)
			return false;
		if (seniorsNumber != other.seniorsNumber)
			return false;
		return true;
	}

}
