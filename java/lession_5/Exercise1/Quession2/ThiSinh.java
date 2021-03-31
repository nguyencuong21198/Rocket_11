package Quession2;

import java.util.Scanner;

public abstract class ThiSinh {
	private String sbd;
	private String name;
	private String address;
	private boolean uutien;

	public ThiSinh() {
	}

	public String getSbd() {
		return sbd;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public boolean isUutien() {
		return uutien;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So Bao Danh:");
		sbd = sc.nextLine();
		System.out.println("Name:");
		name = sc.nextLine();
		System.out.println("Address:");
		address = sc.nextLine();
		System.out.println("Uu tien(c/k):");
		String str = sc.nextLine();
		if (str.equalsIgnoreCase("c"))
			this.uutien = true;
		else
			this.uutien = false;
	}

	public void hienthi() {
		System.out.println("SBD:" + getSbd());
		System.out.println("Name:" + getName());
		System.out.println("Address:" + getAddress());
		System.out.println("Uu tien:" + (this.uutien ? "co" : "khong"));

	}
}
