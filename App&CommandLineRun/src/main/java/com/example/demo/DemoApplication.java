package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
//@ComponentScan("com.example.bean")
@SpringBootApplication
public class DemoApplication implements CommandLineRunner,ApplicationRunner{

	//run method of commandLineRunner and ApplicationRunner executes only once before spring boot app stops. 
	@Override
	public void run(String... args) throws Exception {
		//printed second
		System.out.println("***commandLine runner run mehtod***");
	}
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception { 	
		//printed first
		System.out.println("***application runner run method");		
	}
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);	
		//printed last
		System.out.println("inside boot app...");
	}
}
