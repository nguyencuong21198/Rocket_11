import java.util.Scanner;

public class Main {
	public static int Menu() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình quản lý cán bộ");
		System.out.println("1. Nhap sinh vien");
		System.out.println("2. Hien thi sinh vien");
		System.out.println("3. Xet hoc bong");
		System.out.println("4. Thoát chương trình");
		System.out.println("Mời bạn chọn (1-4):");
		n = sc.nextInt();
		return n;
	}

	public static void main(String[] args) {
		int chon;
		Qlstudent qlstudent = new Qlstudent();
		// hiển thị menu và xử lý chọn menu
		do {
			chon = Main.Menu();// hiển thị menu và gán giá trị trả về cho biến chọn
			// xử lý chọn menu
			switch (chon) {
			case 1:
				qlstudent.nhap();
				break;
			case 2:
				qlstudent.hienthi();
				break;
			case 3:
				qlstudent.xethocbong();
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Bạn nhập sai, mời lại");
				break;
			}
		} while (chon != 4);// chừng nào chọn khác 4 thì quay lại, chon=5 thì thoát
		System.out.println("Kết thúc chương trình");
	}
}
