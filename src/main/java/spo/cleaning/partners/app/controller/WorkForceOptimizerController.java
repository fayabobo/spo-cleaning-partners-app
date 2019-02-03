package spo.cleaning.partners.app.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Workforce optimizer Controller.
 * 
 * @author nsanzfia
 *
 */
@RestController
public class WorkforceOptimizerController {

	/**
	 * Optimizes workforce.
	 * 
	 * @return the responseEntity
	 * @author nsanzfia
	 */
	@RequestMapping(value = "/optimizeWorkforce", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> optimizeWorkForce() {
		return buildResponse();
	}

	/**
	 * Builds the response for this controller.
	 * 
	 * @return responseEntity
	 * @author nsanzfia
	 */
	private ResponseEntity<Object> buildResponse() {
		return ResponseEntity.ok().build();
	}
}
