package com.wipro.FirstSB;


import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSbApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(FirstSbApplication.class, args);
	}
    
	
@Bean
public CommandLineRunner commandLineRunner(ApplicationContext ctx)
{
	return args ->{
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName: beanNames) {
			System.out.println(beanName);
		}
	};
	
}
	
    }

