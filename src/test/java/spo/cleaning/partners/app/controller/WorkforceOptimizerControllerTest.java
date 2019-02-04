package spo.cleaning.partners.app.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import spo.cleaning.partners.app.core.WorkforceOptimizerRequest;
import spo.cleaning.partners.app.exception.InconsitentParametersException;
import spo.cleaning.partners.app.service.OptimizeWorkforceService;

/**
 * Test all the actions in WorkforceOptimizerController
 * 
 * @author fnsanzabandi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class WorkforceOptimizerControllerTest {

	@Mock
	private OptimizeWorkforceService optimizeWorkforceService;

	@InjectMocks
	private WorkforceOptimizerController workforceOptimizerController = new WorkforceOptimizerController();
	 
	/**
	 * Test the method optimizeWorkForce. Case 1: The parameter of the method is null;
	 * 
	 * @author nsanzfia
	 * @throws InconsitentParametersException 
	 */
	@Test
	public void testOptimizeWorkForceCase1() throws InconsitentParametersException {
		// Given
		doReturn(new ArrayList<>()).when(optimizeWorkforceService).optimizeWorkforce(any());
		
		// When
		ResponseEntity<Object> responseEntity = workforceOptimizerController.optimizeWorkForce(null);
		
		// Then
		assertNotNull(responseEntity);
		assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
	}
	
	/**
	 * Test the method optimizeWorkForce. Case 2: The parameter of the method is not null;
	 * 
	 * @author nsanzfia
	 * @throws InconsitentParametersException 
	 */
	@Test
	public void testOptimizeWorkForceCase2() throws InconsitentParametersException {
		// Given
		doReturn(new ArrayList<>()).when(optimizeWorkforceService).optimizeWorkforce(any());
		
		// When
		ResponseEntity<Object> responseEntity = workforceOptimizerController.optimizeWorkForce(new WorkforceOptimizerRequest());
		
		// Then
		assertNotNull(responseEntity);
		assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
	}
}
