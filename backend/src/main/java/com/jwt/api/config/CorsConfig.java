package com.jwt.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
		
			public void addCorsMapping(CorsRegistry registry) {
				registry
					.addMapping("/**")
					.allowedMethods("GET","POST","PUT","DELETE")
					.allowedOrigins("*");
			}
		};
	}
}
