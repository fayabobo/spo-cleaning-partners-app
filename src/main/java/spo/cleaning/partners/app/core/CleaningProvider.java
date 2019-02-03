package spo.cleaning.partners.app.core;

import java.util.List;

import javax.validation.constraints.Size;

import spo.cleaning.partners.app.constants.Constants;

/**
 * Class which represents a cleaning provider
 * 
 * @author nsanzfia
 *
 */
public class CleaningProvider {

	@Size(max = Constants.MAX_STRUCTURES_IN_A_PROVIDER)
	private List<Structure> structures;

	public List<Structure> getStructures() {
		return structures;
	}

	public void setStructures(List<Structure> structures) {
		this.structures = structures;
	}

}
