package spo.cleaning.partners.app.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.service.OptimizeWorkforceService;

/**
 * Workforce optimizer Controller.
 * 
 * @author nsanzfia
 *
 */
@RestController
public class WorkforceOptimizerController {

	@Inject
	private OptimizeWorkforceService optimizeWorkforceService;

	/**
	 * Optimizes workforce.
	 * 
	 * @return the responseEntity
	 * @author nsanzfia
	 */
	@RequestMapping(value = "/optimizeWorkforce", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> optimizeWorkForce(@Valid @RequestBody WorkforceOptimizerRequest workforceOptimizerRequest) {
		return optimizeWorkforceService.optimizeWorkforce(workforceOptimizerRequest);
	}

}
