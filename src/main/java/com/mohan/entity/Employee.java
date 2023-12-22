package com.mohan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Employee {

	@Id
	@Column(name="eid")
	private Integer empid;
	@Column(name="ename")
	private String empname;
	@Column(name="esal")
	private double empsal;
		
	}
