package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
//@Data
//@NoArgsConstructor
public class Employee{

	@Id
	@GeneratedValue
	@Min(value=5,message="less than 5")
	@Max(value=20, message="greater than 20")
	private int id;
	
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp = "[a-z]{3,}",message="pattern is not matching")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
