package backend;

import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Configs;
import entity.HinhTron;
import entity.Hinhvuong;
import entity.Ihinh;

public class Quession8 {
	
	  public static void Work(Ihinh h) { h.nhap(); h.hienthi();
	  System.out.println("Diện tích: " + h.dientich());
	  System.out.println("Chu vi: " + h.chuvi()); }
	 

	public static void main(String[] args)  {

		int chon;
		Scanner scanner = new Scanner(System.in);
		// Ihinh[] ihinhs = new Ihinh[];
		ArrayList<Ihinh> ihinhs = new ArrayList<Ihinh>(Configs.SO_LUONG_HINH_TOI_DA);

		while (true) {
			
			if (ihinhs.size() > 5) {
				  throw new ArrayIndexOutOfBoundsException("Bố chỉ nhận tối đa 5 phần tử!!!");
			}
			else

			System.out.println("Nhập lựa chọn");

			chon = scanner.nextInt();
			switch (chon) {
			case 1: {

				Hinhvuong hv = new Hinhvuong();
				Work(hv);
				ihinhs.add(hv);
				break;
			}
			case 2: {

				HinhTron ht = new HinhTron();
				Work(ht);
				ihinhs.add(ht);
				break;
			}

			case 3: {

				for (Ihinh ihinh : ihinhs) {
					System.out.println("\n\n--------------------------------");
					ihinh.dientich();
					ihinh.chuvi();
					ihinh.hienthi();
					System.out.println("\n\n--------------------------------");

				}
				break;
			}
			default:
				
			 break;
			}
		}

	}
}
