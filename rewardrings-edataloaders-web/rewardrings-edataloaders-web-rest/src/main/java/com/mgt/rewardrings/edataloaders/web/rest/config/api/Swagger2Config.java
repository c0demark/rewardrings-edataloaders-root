/**
 * 
 */
package com.mgt.rewardrings.edataloaders.web.rest.config.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Vijay Kumar
 *
 */
@Configuration(value = "Swagger2Config")
@EnableSwagger2
public class Swagger2Config {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				//		.apiInfo(null)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
}
