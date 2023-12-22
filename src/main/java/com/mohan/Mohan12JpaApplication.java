package com.mohan;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mohan.entity.Employee;
import com.mohan.repo.EmployeeRepository;

@SpringBootApplication
public class Mohan12JpaApplication {

	public static void main(String[] args) {
		
		
	ConfigurableApplicationContext	dr=SpringApplication.run(Mohan12JpaApplication.class, args);
	EmployeeRepository repo= dr.getBean(EmployeeRepository.class);
	
	
	
//	List<Employee>  grt=repo.findByEmpsalGreaterThan(120);
//	
//	
//	for (Employee employee : grt) {
//		System.out.println(employee);
//	}
	
	
//	List<Employee> raj=repo.findByEmpsalLessThan(125);
//	for (Employee employee : raj) {
//		System.out.println(employee);
//	}
	
	List<Employee> dfgh=repo.findByEmpname("mohan");
	
	
	for (Employee employee : dfgh) {
		System.out.println(employee);
	}
	
	
	List<Employee> dfg=repo.getAllenames();
	
	for (Employee employee : dfg) {
		System.out.println(employee);
	}
	
	 //boolean stsus=repo.existsById(10);//where  it is there or not it find in database says true or false
	 System.out.println("record presence="+repo.count());//count gives no of records or present or not
	 
	 
	     Optional<Employee> find=repo.findById(10);
	     if(find.isPresent()) {
	    	 System.out.println(find.get());
	    	 
	   Iterable<Employee> 	r= repo.findAllById(Arrays.asList(10,12));//it checks 2 ids
	   for (Employee employee : r) {
		   System.out.println(employee);
		   
		   
		  Iterable<Employee> gt=repo.findAll();//irt fetch all the data
		  for (Employee employee2 : r) {
			  
			  
			  repo.deleteById(1);//it delete the id in the table
			  if(repo.existsById(1)) {
				  repo.deleteById(1);
			  }
			  else {
				  System.out.println("it not ");
			  }
		}
			  
		  
		
	}
	     }
	}

}
