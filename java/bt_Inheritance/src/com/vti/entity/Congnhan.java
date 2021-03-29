package com.vti.entity;

import java.util.Scanner;

public class Congnhan extends Canbo {
	private int Bac;
	Scanner sc = new Scanner(System.in);

	public Congnhan() {

	}

	public Congnhan(String name, int tuoi, boolean gioiTinh, int bac, Scanner scanner) {
		super(name, tuoi, gioiTinh);
		this.Bac = bac;

	}

	public int getBac() {
		return Bac;
	}

	public void setBac(int bac) {
		Bac = bac;
	}
@Override
	public void nhap() {
		super.nhap();
		System.out.println("Bậc:");
		Bac = sc.nextInt();
	}

	public void hienthi1() {
		super.HienThiTT();
		System.out.println("Bậc của công nhân:" + getBac());
	}
}
