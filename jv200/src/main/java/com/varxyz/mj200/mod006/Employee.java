package com.varxyz.mj200.mod006;

import java.util.Date;

public class Employee {
	protected String name;
	protected double salary;
	public Date birthDate;
	
	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(MyDate myDate) {
		this.birthDate = birthDate;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			if (e.getName().equals(name)
					&& e.getBirthDate().equals(birthDate)){
				return true;
			}
		}
		return false;
	}

}