package com.vti.frontend;

import java.util.Scanner;

import com.vti.entity.QLCB;

public class program11 {
	public static int Menu() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình quản lý cán bộ");
		System.out.println("1. Thêm cán bộ");
		System.out.println("2. Tìm kiếm theo họ tên");
		System.out.println("3. Hiển thị thông tin về danh sách cán bộ");
		System.out.println("4. Nhập vào tên và delete cán bộ đó");
		System.out.println("5. Thoát chương trình");
		System.out.println("Mời bạn chọn (1-4):");
		n = sc.nextInt();
		return n;
	}

	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		int chon;
        //hiển thị menu và xử lý chọn menu
        do{
            chon = program11.Menu();//hiển thị menu và gán giá trị trả về cho biến chọn
            //xử lý chọn menu
            switch(chon){
                case 1:
                   qlcb.addCB();
                   System.out.println("Thêm Thành Công");
                   break;
                case 2:
                   break;
                case 3:
                	qlcb.HienThi();
                    break;
                case 4:
                	qlcb.delete();
                	System.out.println("Xóa Thành Công");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Bạn nhập sai, mời lại");
            }
        }while(chon!=5);//chừng nào chọn khác 4 thì quay lại, chon=5 thì thoát
        System.out.println("Kết thúc chương trình");
	}
}
