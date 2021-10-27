package com.pack;

public class Employee {
	int empid;
	String ename;
	int age;
	double salary;
	String dept;
	String gender;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(int empid, String ename, int age, double salary, String dept, String gender) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
