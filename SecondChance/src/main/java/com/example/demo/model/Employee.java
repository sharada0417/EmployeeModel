package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private String empNo;
	private String name;
	private int age;
	private double salary;
}
