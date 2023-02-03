package com.sparta.hangheamemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HangheamemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangheamemoApplication.class, args);
	}

}
