import java.util.Scanner;

public class Tai_lieu {
	private int MaTL;
	private String TenNhaSX;
	private int SoBanPhatHanh;

	public Tai_lieu() {

	}

	public Tai_lieu(int maTL, String tenNhaSX, int soBanPhatHanh) {
		super();
		MaTL = maTL;
		TenNhaSX = tenNhaSX;
		SoBanPhatHanh = soBanPhatHanh;
	}

	public int getMaTL() {
		return MaTL;
	}

	public void setMaTL(int maTL) {
		MaTL = maTL;
	}

	public String getTenNhaSX() {
		return TenNhaSX;
	}

	public void setTenNhaSX(String tenNhaSX) {
		TenNhaSX = tenNhaSX;
	}

	public int getSoBanPhatHanh() {
		return SoBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		SoBanPhatHanh = soBanPhatHanh;
	}

	public void Nhap() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Mã tài liệu:");
		MaTL = Integer.parseInt( scanner.nextLine());
		System.out.println("Tên nhà xuất bản:");
		TenNhaSX = scanner.nextLine();
		System.out.println();
		System.out.println("Số bản phát hành:");
		SoBanPhatHanh = Integer.parseInt( scanner.nextLine());
	}
	
	public void hienthi() {
		System.out.println("Mã TL:"+getMaTL()+"Tên nhà SX:"+getTenNhaSX()+"Số bản phát hành:"+getSoBanPhatHanh());
	}

}
