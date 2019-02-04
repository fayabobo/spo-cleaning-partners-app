package spo.cleaning.partners.app.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import spo.cleaning.partners.app.core.StructureConfiguration;
import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.service.OptimizeWorkforceService;

/**
 * Service to optimize the workforce.
 * 
 * @author nsanzfia
 *
 */
@Service
public class OptimizeWorkforceServiceImpl implements OptimizeWorkforceService {

	@Override
	public ResponseEntity<Object> optimizeWorkforce(WorkforceOptimizerRequest workforceOptimizerRequest) {
		List<StructureConfiguration> structureConfigurations = new ArrayList<>();
		StructureConfiguration structureConfiguration = new StructureConfiguration(10, 15);
		structureConfigurations.add(structureConfiguration);
		StructureConfiguration structureConfiguration0 = new StructureConfiguration(20, 25);
		structureConfigurations.add(structureConfiguration0);
		return ResponseEntity.ok(structureConfigurations);
	}

}
