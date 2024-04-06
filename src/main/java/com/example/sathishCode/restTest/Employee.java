package com.example.sathishCode.restTest;

public class Employee {
	
	private String empID;
	private String empName;
	private String empAddress;
	private String empPhone;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public Employee(String empID, String empName, String empAddress, String empPhone) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empPhone = empPhone;
	}
	public Employee() {
		super();
	}
	

}
