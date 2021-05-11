package com.java.ess;

public class Employee {

	private int empid;
	private String empname;
	private String emppost;

	public Employee() {

	}

	public Employee(int empid, String empname, String emppost) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emppost = emppost;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmppost() {
		return emppost;
	}

	public void setEmppost(String emppost) {
		this.emppost = emppost;
	}

	public void execute() {
		System.out.println("inside execute method...");
	}
}
