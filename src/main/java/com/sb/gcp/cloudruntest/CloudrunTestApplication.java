package com.sb.gcp.cloudruntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudrunTestApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Cloud run example project <br> Next thing to try is EcoBoost project.";
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudrunTestApplication.class, args);
	}

}
