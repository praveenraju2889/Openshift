package com.basic.openshiftpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftpocApplication {
	
	@GetMapping("/")
	public String getMessgaString() {
		return "Welcome openshift today!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftpocApplication.class, args);
	}

}
