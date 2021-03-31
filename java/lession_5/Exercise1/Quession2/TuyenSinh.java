package Quession2;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	ArrayList<ThiSinh> thisinhs;

	public TuyenSinh() {
		thisinhs = new ArrayList<ThiSinh>();
	}

	public void nhap() {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập danh sách thí sinh:");
		do {
			System.out.println("Nhap so thi sinh >0:");
			n = sc.nextInt();
			
			sc.nextLine();
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			String khoithi;
			ThiSinh ts;
			while (true) {
				System.out.println("Nhập khối thi (A,B,C):");
				khoithi = sc.nextLine();
				if (khoithi.equalsIgnoreCase("A") || khoithi.equalsIgnoreCase("B") || khoithi.equalsIgnoreCase("C"))
					break;
			}
			if (khoithi.equalsIgnoreCase("A"))
				ts = new KhoiA();
			else if (khoithi.equalsIgnoreCase("B"))
				ts = new KhoiB();
			else
				ts = new KhoiC();
			thisinhs.add(ts);
		}
	}
	public void hienthi() {
		System.out.println("Danh sách thí sinh là:");
        for(ThiSinh ts : thisinhs	)
        {
            ts.hienthi();
            System.out.println("--------------------------");
        }
	}
	public void timkiem() {
		
	}
	
	
	public static void main(String[] args) {
		TuyenSinh tuyenSinh = new TuyenSinh();
		tuyenSinh.nhap();
		tuyenSinh.hienthi();
	}
}
