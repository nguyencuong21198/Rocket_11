package com.vti.entity;

import java.util.Scanner;

public class Canbo {
	protected String name;
	protected int tuoi;
	protected boolean GioiTinh;
	
	
	
	
	public Canbo(String name, int tuoi, boolean gioiTinh) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		GioiTinh = gioiTinh;
	}


	public Canbo() {
		
	}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getTuoi() {
		return tuoi;
	}




	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}




	public boolean isGioiTinh() {
		return GioiTinh;
	}




	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên cán bộ");
		name = scanner.nextLine();
		System.out.println("Tuổi cán bộ");
		tuoi= Integer.parseInt(scanner.nextLine());
		System.out.println("Giới Tính");
		String gt = scanner.nextLine();
		GioiTinh = gt.equals("Nam")?true:false;

	}
	
	public void HienThiTT() {
		System.out.println("Tên:"+getName()+"Tuổi:"+getTuoi()+"Giới tính:"+isGioiTinh());
	}
	
}
