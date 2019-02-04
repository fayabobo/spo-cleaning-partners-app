package spo.cleaning.partners.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spo.cleaning.partners.app.core.StructureConfiguration;
import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;

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
	public ResponseEntity<Object> optimizeWorkForce(@Valid @RequestBody WorkforceOptimizerRequest workforceOptimizerRequest) {
		return buildResponse();
	}

	/**
	 * Builds the response for this controller.
	 * 
	 * @return responseEntity
	 * @author nsanzfia
	 */
	private ResponseEntity<Object> buildResponse() {
		List<StructureConfiguration> structureConfigurations = new ArrayList<>();
		StructureConfiguration structureConfiguration = new StructureConfiguration(10, 15);
		structureConfigurations.add(structureConfiguration);
		StructureConfiguration structureConfiguration0 = new StructureConfiguration(20, 25);
		structureConfigurations.add(structureConfiguration0);
		return ResponseEntity.ok(structureConfigurations);
	}
}
