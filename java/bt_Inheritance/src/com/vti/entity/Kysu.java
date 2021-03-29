package com.vti.entity;

import java.util.Scanner;

public class Kysu extends Canbo {
	private String NganhDaoTao;
	Scanner scanner = new Scanner(System.in);

	public Kysu() {

	}

	public Kysu(String name, int tuoi, boolean gioiTinh, String nganhDaoTao) {
		super(name, tuoi, gioiTinh);
		this.NganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return NganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		NganhDaoTao = nganhDaoTao;
	}
@Override
	public void nhap() {
		super.nhap();
		System.out.println("Ngành đào tạo:");
		NganhDaoTao = scanner.nextLine();
	}

	public void hienthi2() {
		super.HienThiTT();
		System.out.println("Ngành đào tạo:" + getNganhDaoTao());
	}
}
