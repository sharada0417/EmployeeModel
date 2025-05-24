package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
	@Id
	private int project_id;
	private String name;
	private long totalcost;
}
