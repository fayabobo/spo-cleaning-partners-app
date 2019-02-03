package spo.cleaning.partners.app.core;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class Response implements Serializable {
	
	List<StructureConfiguration> structureConfigurations;

	public List<StructureConfiguration> getStructureConfigurations() {
		return structureConfigurations;
	}

	public void setStructureConfigurations(List<StructureConfiguration> structureConfigurations) {
		this.structureConfigurations = structureConfigurations;
	}

}
