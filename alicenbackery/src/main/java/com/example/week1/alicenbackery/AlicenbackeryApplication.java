package com.example.week1.alicenbackery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlicenbackeryApplication implements CommandLineRunner {

	@Autowired
	private CakeBaker cb;


	public static void main(String[] args) {
		SpringApplication.run(AlicenbackeryApplication.class, args);

	}

	public void run(String... args){
		cb.bakeCake();
	}

}
