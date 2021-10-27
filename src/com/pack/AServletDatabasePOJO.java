package com.pack;

public class AServletDatabasePOJO {
	private int empid;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int basic;
	private String grade;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public AServletDatabasePOJO(int empid, String name, int age, String gender, String dept, int basic, String grade) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.basic = basic;
		this.grade = grade;
	}
	public AServletDatabasePOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
