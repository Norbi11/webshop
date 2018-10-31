package com.shop.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.shop.webshop.database.*;

@SpringBootApplication
public class WebshopApplication {

	public static void main(String[] args) {
		DB database = new DB();
		SpringApplication.run(WebshopApplication.class, args);
	}
}
