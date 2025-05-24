package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int project_id;
	private String name;
	private long totalcost;
	
	@ManyToMany(mappedBy="projects")
	private List <Employee> employees;
}
