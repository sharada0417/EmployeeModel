package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private String empNo;
	private String name;
	private int age;
	private double salary;
	
	@ManyToMany
	@JoinColumn(name="dept_id")
	private Department department;
}
