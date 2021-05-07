package com.amazon.qa.base;
//to  implement of encapsulation in java  
// create private variables 
// these variables cannot access outside the class 
// to create data from getter and setter method to access these private variables 
public class EmployeeData {

	//Private Data Variables 
			private int aaddhar;
			private String empName;
			private int empAge;
			
			
			
	
	public static void main(String[] args) {
		// to access method in this employeedata class need to create obj of this class 
		EmployeeData emp = new EmployeeData();
		
		
		}
	
	// create Getter and Setter Method by generating  from source  
	//Getter and Setter Method 

	public int getAaddhar() {
		return aaddhar;
	}

	public void setAaddhar(int num) {
		//this.classVariable = localVariable
		this.aaddhar = num;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
