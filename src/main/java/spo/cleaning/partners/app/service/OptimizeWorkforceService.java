package spo.cleaning.partners.app.service;

import java.util.List;

import spo.cleaning.partners.app.core.StructureConfiguration;
import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.exception.InconsitentParametersException;

/**
 * Service to optimize the workforce.
 * 
 * @author nsanzfia
 *
 */
public interface OptimizeWorkforceService {

	/**
	 * Optimizes workforce.
	 * 
	 * @param workforceOptimizerRequest
	 * @return ResponseEntity
	 * @author nsanzfia
	 * @throws InconsitentParametersException 
	 */
	List<StructureConfiguration> optimizeWorkforce(WorkforceOptimizerRequest workforceOptimizerRequest) throws InconsitentParametersException;

}
