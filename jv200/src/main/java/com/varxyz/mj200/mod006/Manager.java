package com.varxyz.mj200.mod006;

public class Manager extends Employee {
	String department;
	
	//method overriding
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
				
	}
}
