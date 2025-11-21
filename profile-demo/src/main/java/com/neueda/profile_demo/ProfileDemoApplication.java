package com.neueda.profile_demo;

import com.neueda.profile_demo.configuration.ProfileConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProfileDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(ProfileDemoApplication.class);

	@Value("${myapp.environment:dev}")
	private String environment;

	@Value("${myapp.dummydata:Dev Data Loaded by default}")
	private String dummyData;

	@Autowired
	private ProfileConfig profileConfig;

	public static void main(String[] args) {
		SpringApplication.run(ProfileDemoApplication.class, args);
	}


	@Bean
	public String getEnvironmentInfo() {
		logger.info("Current Environment: " + environment);
		logger.info("**Data: " + dummyData);
		logger.info("**Profile Name:  " + profileConfig.getName());
		logger.info("**Profile version:" + profileConfig.getVersion());
		return "Environment: " + environment + ", Dummy Data: " + dummyData + ", Profile Name: " + profileConfig.getName() + ", Profile Version: " + profileConfig.getVersion();
	}

}
