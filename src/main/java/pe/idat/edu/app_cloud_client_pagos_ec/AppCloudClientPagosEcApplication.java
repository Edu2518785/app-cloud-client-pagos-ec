package pe.idat.edu.app_cloud_client_pagos_ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppCloudClientPagosEcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCloudClientPagosEcApplication.class, args);
	}

}
