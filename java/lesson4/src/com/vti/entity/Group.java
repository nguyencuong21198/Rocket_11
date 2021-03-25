package com.vti.entity;

import java.util.Date;

public class Group {
	private int ID;
	private String GroupName;
	private Date CreateDate; 
	private Account creator;
	public Group() {
		super();
	}
	public Group(int iD, String groupName, Date createDate, Account creator) {
		super();
		ID = iD;
		GroupName = groupName;
		CreateDate = createDate;
		this.creator = creator;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	
}
