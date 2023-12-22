package com.mohan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mohan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//select* from employee where sal>120
//	public List<Employee> findByEmpsalGreaterThan(double price);
//
//	public List<Employee> findByEmpsalGreaterThan(int price);
//	
//	//select* from employee where sal<120
//	public List<Employee> findByEmpsalLessThan(int price);
//	
	public List<Employee> findByEmpname(String string);
//	
	@Query(value = "select * from employee",nativeQuery = true)
	public List<Employee> getAllenames();
	@Query("from Employee")
	public List<Employee> getEmployees();
	
}
