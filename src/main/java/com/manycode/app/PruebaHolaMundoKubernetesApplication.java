package com.manycode.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaHolaMundoKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaHolaMundoKubernetesApplication.class, args);
	}
	
	
	@GetMapping("/")
	public String welcome() {
		return "Hola al mundo de Many en Kubernetes";
	}

}
