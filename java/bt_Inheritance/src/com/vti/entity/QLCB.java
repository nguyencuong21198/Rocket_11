package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	private List<Canbo> cb;

	public QLCB() {
		cb = new ArrayList<Canbo>();
	}

	public void addCB() {
		int n, chon;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số cán bộ");
		n = sc.nextInt();
		Canbo canbo = new Canbo();
		for (int i = 0; i < n; i++) {
			System.out.println("Mời bạn nhập cán bộ nhập (1:công nhân, 2: kỹ sư, 3: Nhân viên)");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				Congnhan cn = new Congnhan();
				cn.nhap();
				cb.add(cn);
				break;
			case 2:
				Kysu ks = new Kysu();
				ks.nhap();
				cb.add(ks);
				break;
			case 3:
				Nhanvien nv = new Nhanvien();
				nv.nhap();
				cb.add(nv);
				break;
			default:
				System.out.println("Nhập sai!");
				i--;
				break;
			}
			canbo.nhap();
			
			
		}
	}
	
	public void HienThi() {
		for(Canbo canbo:cb) {
			canbo.HienThiTT();
		}
	}
	
	public void TimKiem() {
		
	}
	public void delete() {
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên cán bộ muốn xóa");
		ten = sc.nextLine();
		for(Canbo canbo:cb) {
			if(ten.equals(canbo.getName()) ){
				cb.remove(canbo);
			}
		}
	}
}
