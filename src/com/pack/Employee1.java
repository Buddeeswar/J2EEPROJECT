package com.pack;

public class Employee1 {
	int empid, age,basic;
	String name,gender,dept,grade;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Employee1(int empid, int age, int basic, String name, String gender, String dept, String grade) {
		super();
		this.empid = empid;
		this.age = age;
		this.basic = basic;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.grade = grade;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
