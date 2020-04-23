package com.chenyy.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.chenyy"})
public class InitApplication {
	public static void main(String[] args) {
		SpringApplication.run(InitApplication.class, args);
	}
}
