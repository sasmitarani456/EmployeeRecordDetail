package com.hutech.employeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class EmployeeDetailApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailApplication.class, args);
	}

}
