package spo.cleaning.partners.app.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
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
	private int seniors;

	/**
	 * The number of juniors in this configuration.
	 */
	private int juniors;

	public StructureConfiguration() {
		super();
	}

	public StructureConfiguration(int seniors, int juniors) {
		super();
		this.seniors = seniors;
		this.juniors = juniors;
	}

	public int getSeniors() {
		return seniors;
	}

	public void setSeniors(int seniors) {
		this.seniors = seniors;
	}

	public int getJuniors() {
		return juniors;
	}

	public void setJuniors(int juniors) {
		this.juniors = juniors;
	}

}
