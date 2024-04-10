package com.jakbour.mowitnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jakbour.mowitnow.model.Field;
import com.jakbour.mowitnow.service.MowerFileReader;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		runMowerFileReader();
	}

	private static void runMowerFileReader() {
		Field field = MowerFileReader.reader();

		field.moveMowers();
		field.getMowers().forEach(System.out::println);
	}
}
