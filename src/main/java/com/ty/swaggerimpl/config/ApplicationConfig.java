package com.ty.swaggerimpl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration

public class ApplicationConfig {
	@Bean
	public OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI().info(new Info().title("swagger imp RESTful Web Service documentation")
				.description("Your API Description").version("1.0"));
	}

}
