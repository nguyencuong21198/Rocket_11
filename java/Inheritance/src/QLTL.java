import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTL {
	private List<Tai_lieu> tl;

	public QLTL() {
		tl = new ArrayList<Tai_lieu>();
	}

	public void ADD() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n:");
		n = sc.nextInt();

		int chon;
		Tai_lieu lieu = new Tai_lieu();
		for (int i = 0; i < n; i++) {
			System.out.println("Mời bạn chọn tài liệu muốn nhập (1:Sách, 2: Tạp chí, 3: Báo)");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				Sach s = new Sach();
				s.Nhap();
				tl.add(s);

				break;
			case 2:
				Tap_chi tc = new Tap_chi();
				tc.Nhap();
				tl.add(tc);

				break;
			case 3:
				Bao b = new Bao();
				b.Nhap();
				tl.add(b);

				break;
			default:
				System.out.println("Nhập sai !");
				i--;
				break;
			}
			lieu.Nhap();

		}
	}

	public void Delete_MaTL() {
		int matl;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu cần xóa:");
		matl = sc.nextInt();
		for (Tai_lieu tai_lieu : tl) {
			if (matl == tai_lieu.getMaTL()) {
				tl.remove(tai_lieu);
			}
		}
	}

	public void HienThiTT() {
		for (Tai_lieu tai_lieu : tl) {
			tai_lieu.hienthi();
		}
	}

	public void TimKiem() {
		Scanner sc = new Scanner(System.in);
		int choose;
		System.out.println("Bạn muốn tìm kiếm tài liệu gì??"); // (1: Sách,2: Tạp chí,3: Báo)
		choose = sc.nextInt();

		switch (choose) {
		case 1:
			for (Tai_lieu taiLieu : tl) {
				if (taiLieu instanceof Sach) {
					taiLieu.hienthi();
				}
			}
			break;
		case 2:
			for (Tai_lieu taiLieu : tl) {
				if (taiLieu instanceof Tap_chi) {
					taiLieu.hienthi();
				}
			}
			break;
		case 3:
			for (Tai_lieu taiLieu : tl) {
				if (taiLieu instanceof Bao) {
					taiLieu.hienthi();
				}
			}
			break;
		default:
			System.out.println("sai !");
			break;
		}
	}
}
