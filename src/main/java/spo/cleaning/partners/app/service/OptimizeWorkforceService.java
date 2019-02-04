package spo.cleaning.partners.app.service;

import org.springframework.http.ResponseEntity;

import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;

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
	 */
	ResponseEntity<Object> optimizeWorkforce(WorkforceOptimizerRequest workforceOptimizerRequest);

}
