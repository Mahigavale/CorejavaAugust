package com.Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FlipKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipKartApplication.class, args);
	}

}
