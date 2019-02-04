package spo.cleaning.partners.app.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import spo.cleaning.partners.app.core.StructureConfiguration;
import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.exception.InconsitentParametersException;
import spo.cleaning.partners.app.service.OptimizeWorkforceService;
import utils.StructureConfigurationMockBuilder;
import utils.WorkforceOptimizerRequestMockBuilder;

/**
 * Test all the services in ptimizeWorkforceServiceImpl.
 * 
 * @author fnsanzabandi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class OptimizeWorkforceServiceImplTest {

	@InjectMocks
	private OptimizeWorkforceService optimizeWorkforceService = new OptimizeWorkforceServiceImpl();

	/**
	 * Test the method optimizeWorkforce. Case 1: parameter WorkforceOptimizerRequest is null.
	 * 
	 * @author nsanzfia
	 * @throws InconsitentParametersException 
	 */
	@Test(expected = InconsitentParametersException.class)
	public void testOptimizeWorkforceCase1() throws InconsitentParametersException {

		// When
		optimizeWorkforceService.optimizeWorkforce(null);
	}

	/**
	 * Test the method optimizeWorkforce. Case 2: parameter WorkforceOptimizerRequest is not null.
	 * 
	 * @author nsanzfia
	 * @throws InconsitentParametersException 
	 */
	@Test
	public void testOptimizeWorkforceCase2() throws InconsitentParametersException {
		// Given
		WorkforceOptimizerRequest workforceOptimizerRequest = WorkforceOptimizerRequestMockBuilder.buildWorkforceOptimizerRequestMock1();
		List<StructureConfiguration> expectedStructureConfigurations = StructureConfigurationMockBuilder.buildExpectedStructureConfigurationsMock1();

		// When
		List<StructureConfiguration> structureConfigurations = optimizeWorkforceService.optimizeWorkforce(workforceOptimizerRequest);

		// Then
		assertNotNull(structureConfigurations);
		assertEquals(expectedStructureConfigurations, structureConfigurations);
	}

	/**
	 * Test the method optimizeWorkforce. Case 3: parameter WorkforceOptimizerRequest is not null. This is an other case different to the one in the test testOptimizeWorkforceCase2.
	 * 
	 * @author nsanzfia
	 * @throws InconsitentParametersException 
	 */
	@Test
	public void testOptimizeWorkforceCase3() throws InconsitentParametersException {
		// Given
		WorkforceOptimizerRequest workforceOptimizerRequest = WorkforceOptimizerRequestMockBuilder.buildWorkforceOptimizerRequestMock2();
		List<StructureConfiguration> expectedStructureConfigurations = StructureConfigurationMockBuilder.buildExpectedStructureConfigurationsMock2();

		// When
		List<StructureConfiguration> structureConfigurations = optimizeWorkforceService.optimizeWorkforce(workforceOptimizerRequest);

		// Then
		assertNotNull(structureConfigurations);
		assertEquals(expectedStructureConfigurations, structureConfigurations);
	}
}
