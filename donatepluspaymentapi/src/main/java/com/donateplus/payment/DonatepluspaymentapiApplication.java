package com.donateplus.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer //configure resource oAuth2
public class DonatepluspaymentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonatepluspaymentapiApplication.class, args);
	}

}
