package com.mohan.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mohan.entity.Employee;
import com.mohan.repo.EmployeeRepository;
@Component
public class Test implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
				Employee emp=new Employee();
				emp.setEmpid(10);
				emp.setEmpname("mohan");
				emp.setEmpsal(20000.0);
				repo.save(emp);
				System.out.println("record inserted sucessfully");
				
				Employee emp1=new Employee();
				emp1.setEmpid(121);
				emp1.setEmpname(" kumar");
				emp1.setEmpsal(12);
				repo.save(emp1);
				System.out.println("record inserted sucessfully");
				
//				List<Employee> bl=new ArrayList<>();
//				bl.add(emp);
//				bl.add(emp1);
//				repo.saveAll(bl);
				
				repo.saveAll(Arrays.asList(emp,emp1));
				
//			Employee	e=new Employee();
//			e.setEmpid(45);
				repo.existsById(10);

	}

}
