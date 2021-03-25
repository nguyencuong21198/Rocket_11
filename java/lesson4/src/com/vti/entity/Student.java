package com.vti.entity;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private double diemHocLuc;

	// b
	public Student(int id, String name, String hometown) {

		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = 0;
	}

	// c
	public void themDiem(double them) {
		this.diemHocLuc = this.diemHocLuc + them;
	}

	// e
	public void showStudent() {
		System.out.println("Ho ten: " + this.name);
		System.out.println("Homtown: " + this.hometown);
		if (this.diemHocLuc < 4.0) {
			System.out.println("Hoc luc yeu");
		} else if (this.diemHocLuc > 4.0 && this.diemHocLuc < 6.0) {
			System.out.println("Hoc luc trung binh");
		} else if (this.diemHocLuc > 6.0 && this.diemHocLuc < 8.0) {
			System.out.println("Hoc luc kha");
		} else if (this.diemHocLuc > 8.0) {
			System.out.println("Hoc luc gioi");
		}

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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public double getDiemHocLuc() {
		return diemHocLuc;
	}

//b
	public void setDiemHocLuc(double diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
}
