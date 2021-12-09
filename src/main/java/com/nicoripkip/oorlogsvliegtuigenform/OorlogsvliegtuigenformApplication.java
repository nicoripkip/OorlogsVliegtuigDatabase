package com.nicoripkip.oorlogsvliegtuigenform;

import com.nicoripkip.plane.PlaneController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nicoripkip")
public class OorlogsvliegtuigenformApplication {

	public static void main(String[] args) {
		SpringApplication.run(OorlogsvliegtuigenformApplication.class, args);
	}

}
