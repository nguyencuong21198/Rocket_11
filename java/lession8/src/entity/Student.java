package entity;

import java.util.Date;
import java.util.Scanner;

public class Student {
	// Quession1
	private int id;
	private String name;
	private float diem;
	private Date ngaysinh;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



}
