package com.sod.servidorregistro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EnableEurekaServer
@SpringBootApplication
@EntityScan(basePackages = "com.sod.servidorregistro",basePackageClasses = Jsr310JpaConverters.class)
public class ServidorRegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorRegistroApplication.class, args);
	}
}
