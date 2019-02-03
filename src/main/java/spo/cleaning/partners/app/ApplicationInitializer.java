package spo.cleaning.partners.app;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Initializes the application.
 * 
 * @author nsanzfia
 *
 */
@SpringBootApplication
public class ApplicationInitializer extends SpringBootServletInitializer {

	private final Logger logger = LoggerFactory.getLogger(ApplicationInitializer.class);

	/**
	 * Initializes the application.
	 * 
	 * @param args
	 * @author nsanzfia
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationInitializer.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			logger.info("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				logger.info(beanName);
			}
		};
	}
}
