import java.util.Scanner;

public class Main {

	public static int Menu() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN");
		System.out.println("1. Thêm tài liệu ");
		System.out.println("2. Xóa tài liệu");
		System.out.println("3. Hiện thị tài liệu");
		System.out.println("4. Tìm kiếm tài liệu");
		System.out.println("0. Thoát");
		System.out.println("=====================");
		n = sc.nextInt();
		return n;
	}

	public static void main(String[] args) {
		QLTL qltl = new QLTL();
		int chon;
		do {
			chon = Menu();
			switch (chon) {
			case 1:
				qltl.ADD();
				
				System.out.println("Thêm Thành Công");
				break;
			case 2:
				qltl.Delete_MaTL();
				System.out.println("Xóa Thành Công");
				break;
			case 3:
				qltl.HienThiTT();
				break;
			case 4:
				qltl.TimKiem();
				break;
			case 5:
				System.out.println("Goodbye!!! ");
			default:
				
				break;
			}
		} while (chon != 5);
		System.out.println("Kết thúc chương trình ");
	}
}
