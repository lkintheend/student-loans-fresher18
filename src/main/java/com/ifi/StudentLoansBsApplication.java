package com.ifi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifi.service.StudentAddressesService;

@SpringBootApplication
public class StudentLoansBsApplication implements CommandLineRunner {

	@Autowired
	StudentAddressesService addressesService;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentLoansBsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(addressesService.findAll());
		
	}
}
