package utils;

import java.util.ArrayList;
import java.util.List;

import spo.cleaning.partners.app.core.StructureConfiguration;

/**
 * An utility class for the creation of some StructureConfiguration mocks.
 * 
 * @author nsanzfia
 *
 */
public final class StructureConfigurationMockBuilder {

	private StructureConfigurationMockBuilder() {
		// Private constructor to avoid the initialization of this class.
	}

	/**
	 * Builds a list of expected configurations
	 * 
	 * @return a list of StructureConfiguration
	 * @author nsanzfia
	 */
	public static List<StructureConfiguration> buildExpectedStructureConfigurationsMock1() {
		List<StructureConfiguration> expectedStructureConfigurations = new ArrayList<>();
		StructureConfiguration structureConfiguration = new StructureConfiguration(3, 1);
		expectedStructureConfigurations.add(structureConfiguration);
		StructureConfiguration structureConfiguration0 = new StructureConfiguration(1, 2);
		expectedStructureConfigurations.add(structureConfiguration0);
		StructureConfiguration structureConfiguration1 = new StructureConfiguration(2, 0);
		expectedStructureConfigurations.add(structureConfiguration1);
		return expectedStructureConfigurations;
	}

	/**
	 * Builds a list of expected configurations
	 * 
	 * @return a list of StructureConfiguration
	 * @author nsanzfia
	 */
	public static List<StructureConfiguration> buildExpectedStructureConfigurationsMock2() {
		List<StructureConfiguration> expectedStructureConfigurations = new ArrayList<>();
		StructureConfiguration structureConfiguration = new StructureConfiguration(2, 1);
		expectedStructureConfigurations.add(structureConfiguration);
		StructureConfiguration structureConfiguration0 = new StructureConfiguration(2, 1);
		expectedStructureConfigurations.add(structureConfiguration0);
		return expectedStructureConfigurations;
	}
}
