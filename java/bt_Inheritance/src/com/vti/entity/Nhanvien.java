package com.vti.entity;

import java.util.Scanner;

public class Nhanvien extends Canbo{
	private String Congviec;
	
	
	Scanner scanner  = new Scanner(System.in);

	public Nhanvien() {
		
	}

	public Nhanvien(String name, int tuoi, boolean gioiTinh, String congviec) {
		super(name, tuoi, gioiTinh);
		this.Congviec = congviec;
	}

	public String getCongviec() {
		return Congviec;
	}

	public void setCongviec(String congviec) {
		Congviec = congviec;
	}
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Công việc:");
		Congviec = scanner.nextLine();
	}
	public void hienthi3() {
		super.HienThiTT();
		System.out.println("Công việc:"+getCongviec());
	}
}
