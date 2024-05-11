package com.excelReuniones.excelReuniones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExcelReunionesApplication {

	//docker run -p 8080:8080 excel_reuniones_docker_image
	public static void main(String[] args) {
		SpringApplication.run(ExcelReunionesApplication.class, args);
	}
	
	@RequestMapping("/")
	public ResponseEntity get() {
		return ResponseEntity.ok("OK");
	}

}
