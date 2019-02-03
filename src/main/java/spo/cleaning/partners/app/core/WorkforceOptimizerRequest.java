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

	@NotNull
	@JsonProperty("cleaningProviders")
	List<CleaningProvider> cleaningProviders;
	
	@NotNull
	@JsonProperty("seniorCleaners")
	List<SeniorCleaner> seniorCleaners;
	
	@NotNull
	@JsonProperty("juniorCleaners")
	List<JuniorCleaner> juniorCleaners;

	public List<CleaningProvider> getCleaningProviders() {
		return cleaningProviders;
	}

	public void setCleaningProviders(List<CleaningProvider> cleaningProviders) {
		this.cleaningProviders = cleaningProviders;
	}

	public List<SeniorCleaner> getSeniorCleaners() {
		return seniorCleaners;
	}

	public void setSeniorCleaners(List<SeniorCleaner> seniorCleaners) {
		this.seniorCleaners = seniorCleaners;
	}

	public List<JuniorCleaner> getJuniorCleaners() {
		return juniorCleaners;
	}

	public void setJuniorCleaners(List<JuniorCleaner> juniorCleaners) {
		this.juniorCleaners = juniorCleaners;
	}
	
	
}
