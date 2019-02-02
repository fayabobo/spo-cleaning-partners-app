package spo.cleaning.partners.app.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spo.cleaning.partners.app.core.Response;

/**
 * Workforce optimizer Controller.
 * 
 * @author nsanzfia
 *
 */
@RestController
@RequestMapping("/work-force-optimizer")
public class WorkForceOptimizerController {

	/**
	 * Optimizes workforce.
	 * 
	 * @return the responseEntity
	 * @author nsanzfia
	 */
	@RequestMapping(value = "/optimize", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> optimizeWorkForce() {
		return buildResponse();
	}

	/**
	 * Builds the response for this controller.
	 * 
	 * @return responseEntity
	 * @author nsanzfia
	 */
	private ResponseEntity<Response> buildResponse() {
		return ResponseEntity.ok(new Response());
	}
}
