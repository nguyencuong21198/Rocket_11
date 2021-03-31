package Quession2;

import java.util.Scanner;

public class KhoiB extends ThiSinh {
	private String cacmon;


	public KhoiB() {
		nhap();
	}

	

	public String getCacmon() {
		return cacmon;
	}



	public void setCacmon(String cacmon) {
		this.cacmon = cacmon;
	}



	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Toan:");
		cacmon = sc.nextLine();
		
	}

	@Override
	public void hienthi() {
		super.hienthi();
		System.out.println("Cac mon:" + getCacmon());
		
	}
}
