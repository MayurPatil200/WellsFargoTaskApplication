package com.example.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entities.Department;
import com.example.entities.Employee;
import com.example.repositories.Department_Repository;
import com.example.repositories.Employee_reopository;

@SpringBootApplication
@EntityScan(basePackages = "com.example.*")
@ComponentScan(basePackages = "com.example.*")
@EnableJpaRepositories(basePackages = "com.example.*")
public class WellsFargoTaskApplication {

	private static final Logger log = LoggerFactory.getLogger(WellsFargoTaskApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WellsFargoTaskApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner demo(Employee_reopository Erepository, Department_Repository Drepository ) {
	    return (args) -> {
//	    	 // save a few Employee and Department
//			Department d1 = new Department("Mechanical");
//			Department d2= new Department("Civil");
//	    	Drepository.save(d1);
//	    	Drepository.save(d2);
//	    	
//	    	Erepository.save(new Employee("Mayur", 50000, d1));
//	    	Erepository.save(new Employee("Rajesh",60000, d2));
//	    	
//	    	
	    	
	    	  // fetch all Employee and Department
	    	Drepository.findAll().forEach(department -> {
	            log.info(department.toString());
	          });
	    	
	    	Erepository.findAll().forEach(employee -> {
	            log.info(employee.toString());
	          });
	    	
	    	// fetch id wise Employee and Department
	    	Optional<Employee>  employee = Erepository.findById(1L);
	        log.info("Customer found with findById(1L):");
	        log.info("--------------------------------");
	        log.info(employee.toString());
	        log.info("");
	        
	        
	        Optional<Department>  department = Drepository.findById(1L);
	        log.info("Customer found with findById(1L):");
	        log.info("--------------------------------");
	        log.info(department.toString());
	        log.info("");
	        
	        
	        
	    };
	}
}
