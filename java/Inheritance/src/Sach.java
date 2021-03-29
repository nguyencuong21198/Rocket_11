import java.util.Scanner;

public class Sach extends Tai_lieu {
	private String TacGia;
	private int SoTrang;

	public Sach() {

	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public int getSoTrang() {
		return SoTrang;
	}

	public void setSoTrang(int soTrang) {
		SoTrang = soTrang;
	}

	@Override
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập tên tác giả: ");
		TacGia = sc.nextLine();

		System.out.println("Nhập số trang: ");
		SoTrang = sc.nextInt();
	}
	
	public void hienthi1() {
		super.hienthi();
		System.out.println("Tên tác giả:"+getTacGia()+"Số trang:"+getSoTrang());
	}
}
