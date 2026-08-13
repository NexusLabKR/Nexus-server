package com.nexus;

import org.springframework.boot.SpringApplication;

public class TestNexusApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrbitApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
