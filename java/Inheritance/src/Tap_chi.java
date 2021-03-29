
import java.util.Scanner;

public class Tap_chi extends Tai_lieu {
	private int SoPhatHanh;
	private int ThangPhatHanh;

	public Tap_chi() {

	}

	public int getSoPhatHanh() {
		return SoPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		SoPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return ThangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		ThangPhatHanh = thangPhatHanh;
	}
	@Override
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Số phát hành:");
		SoPhatHanh = sc.nextInt();
		System.out.println("Tháng Phát hành:");
		ThangPhatHanh = sc.nextInt();
	}
	public void hienthi2() {
		super.hienthi();
		System.out.println("Số phát hành:"+getSoPhatHanh()+"Tháng phát hành"+getThangPhatHanh());
	}
}
