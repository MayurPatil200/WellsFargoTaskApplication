package com.example.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dett_id;

    private String Dept_name;

    
    
    
    
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(String dept_name) {
		super();
		Dept_name = dept_name;
	}


	public Long getDett_id() {
		return dett_id;
	}


	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}


	@Override
	public String toString() {
		return "Department [dett_id=" + dett_id + ", Dept_name=" + Dept_name + "]";
	}

   

	


	
}
