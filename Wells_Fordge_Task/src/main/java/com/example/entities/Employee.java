package com.example.entities;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String name;
   private int Salary;
   @ManyToOne
    private Department department;
   
   
   
   
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(String name, int salary, Department department) {
	super();
	this.name = name;
	Salary = salary;
	this.department = department;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", department=" + department + "]";
}
   
  

	
     
}
