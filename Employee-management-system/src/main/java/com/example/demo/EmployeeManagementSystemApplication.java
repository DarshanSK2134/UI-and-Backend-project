package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@ComponentScan
@EntityScan
@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		 

		Employee employee1 =new Employee(1, "Kiran", "kiran@gmail.com");
		employeeRepository.save(employee1);
		Employee employee2 =new Employee(2, "Darshan","darshan@gmail.com");
		employeeRepository.save(employee2);		
		Employee employee3 =new Employee(3, "Anagha","anagha@gmail.com");
		employeeRepository.save(employee3);
	}

}
