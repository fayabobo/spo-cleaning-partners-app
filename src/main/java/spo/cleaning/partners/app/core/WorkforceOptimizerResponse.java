package spo.cleaning.partners.app.core;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Class which represents the response to the WorkforceOptimizerController.
 * 
 * @author nsanzfia
 *
 */
@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class WorkforceOptimizerResponse implements Serializable {

	@JsonProperty()
	List<StructureConfiguration> structureConfigurations;

	public List<StructureConfiguration> getStructureConfigurations() {
		return structureConfigurations;
	}

	public void setStructureConfigurations(List<StructureConfiguration> structureConfigurations) {
		this.structureConfigurations = structureConfigurations;
	}

}
