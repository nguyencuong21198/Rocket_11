import java.util.Scanner;

public class Main {
	/*
	 * public static int Menu() { int n; Scanner sc = new Scanner(System.in);
	 * System.out.println("Chương trình quản lý cán bộ");
	 * System.out.println("1. Điểm danh"); System.out.println("2. Học bài");
	 * System.out.println("3. Đi dọn vệ sinh");
	 * System.out.println("4. Thoát chương trình");
	 * System.out.println("Mời bạn chọn (1-4):"); n = sc.nextInt(); return n; }
	 */

	public static void main(String[] args) {

		Qlstudent qlstudent = new Qlstudent();
		qlstudent.diemdanh();
		qlstudent.hocbai();
		qlstudent.donvs();

		/*
		 * int chon; do { chon = Main.Menu();
		 * 
		 * switch (chon) { case 1: qlstudent.diemdanh();; break; case 2:
		 * qlstudent.hocbai();; break; case 3: qlstudent.donvs(); break; case 4:
		 * System.out.println("Goodbye!"); break; default:
		 * System.out.println("Bạn nhập sai, mời lại"); break; } } while (chon != 4);
		 * System.out.println("Kết thúc chương trình"); }
		 */
	}
}
