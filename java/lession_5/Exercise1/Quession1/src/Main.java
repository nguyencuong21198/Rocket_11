import java.util.Scanner;

public class Main {
	public static int Menu() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình quản lý cán bộ");
		System.out.println("1. Insert New");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
		System.out.println("Mời bạn chọn (1-5):");
		n = sc.nextInt();
		return n;
	}
	public static void main(String[] args) {
		int chon;
		MyNews myNews = new MyNews();
		// hiển thị menu và xử lý chọn menu
		do {
			chon = Main.Menu();// hiển thị menu và gán giá trị trả về cho biến chọn
			// xử lý chọn menu
			switch (chon) {
			case 1:
				myNews.insert();
				break;
			case 2:
				myNews.view();
				break;
			case 3:
				myNews.averageRate();
				myNews.view();
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
