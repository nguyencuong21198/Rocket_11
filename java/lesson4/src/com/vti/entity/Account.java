package com.vti.entity;

import java.util.Date;

public class Account {
	private int 	ID;
	private String 	email;
	private String 	userName;
	private String 	fullName;
	private Date 	createDate;
	Department	department;
	
	public Account() {
		super();
	}

	public Account(int iD, String email, String userName, String fullName, Date createDate, Department department) {
		super();
		ID = iD;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.createDate = createDate;
		this.department = department;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
