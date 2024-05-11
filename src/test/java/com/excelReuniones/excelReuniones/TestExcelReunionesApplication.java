package com.excelReuniones.excelReuniones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestExcelReunionesApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExcelReunionesApplication::main).with(TestExcelReunionesApplication.class).run(args);
	}

}
