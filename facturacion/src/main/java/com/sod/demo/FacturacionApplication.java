package com.sod.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan(basePackages = "com.sod.demo", basePackageClasses = Jsr310JpaConverters.class)
public class FacturacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturacionApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.sod.demo.controlador"))
				.build()
				.apiInfo(metaData());
		
	}
	
	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo(
				"Facturación con Spring Boot",
				"Sistemas Operativos Distribuidos",
				"1.0",
				"Terms of service",
				new Contact("Bryan Espinoza - Kevin Carrion - Karen Chiquito" +
						" - Javier Cobeña - Dayana Garcia - Kevin Toala - David Viteri", "", ""),
				"Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}
}
