package com.pack;

import java.io.Serializable;

public class Emp_Bean_Class implements Serializable {
       private int code;
       private String name;
      private float salary;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
       
}
