package com.wipro.FourthSB;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.Account;
import com.model.AccountRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.model")
@EntityScan(basePackages="com.model")
@ComponentScan(basePackages="com.controller")
public class FourthSbApplication {
	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(FourthSbApplication.class, args);
	}

	
@PostConstruct
public void init()
{
	System.out.println("Inside save");
	Account a1=new Account("20408518", "Sankhadeep", "Ray", "sankhadeep.ray1@wipro.com", "Kolkata");
	Account a2=new Account("20408515", "Sayan", "Paul", "sayan.paul3@wipro.com", "Kolkata");
	
	ArrayList<Account> accounts=new ArrayList<Account>();
	accounts.add(a1);
	accounts.add(a2);
	System.out.println("Before saved");
	accountRepository.saveAll(accounts);
	System.out.println("Saved");
	
	
	
}
}
