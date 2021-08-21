package br.com.spring.apirestdemo;

import br.com.spring.apirestdemo.models.ObjColor;
import br.com.spring.apirestdemo.repository.IObjColorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ApirestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestdemoApplication.class, args);
	}


}
