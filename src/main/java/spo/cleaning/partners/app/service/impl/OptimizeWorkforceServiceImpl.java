package spo.cleaning.partners.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spo.cleaning.partners.app.core.StructureConfiguration;
import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.exception.InconsitentParametersException;
import spo.cleaning.partners.app.service.OptimizeWorkforceService;
import spo.cleaning.partners.app.service.impl.utils.BuildStructureConfigurationUtils;

/**
 * Service to optimize the workforce.
 * 
 * @author nsanzfia
 *
 */
@Service
public class OptimizeWorkforceServiceImpl implements OptimizeWorkforceService {

	@Override
	public List<StructureConfiguration> optimizeWorkforce(final WorkforceOptimizerRequest workforceOptimizerRequest) throws InconsitentParametersException {

		if (workforceOptimizerRequest == null) {
			throw new InconsitentParametersException();
		}
		
		List<StructureConfiguration> structureConfigurations = new ArrayList<>();

		for (int structureRoomsNumber : workforceOptimizerRequest.getListOfRoomNumbersInEachStructure()) {
			structureConfigurations.add(BuildStructureConfigurationUtils.buildStructureConfiguration(structureRoomsNumber, workforceOptimizerRequest.getSeniorCapacity(), workforceOptimizerRequest.getJuniorCapacity()));
		}

		return structureConfigurations;
	}
}
