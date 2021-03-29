import java.util.Scanner;

public class Bao extends Tai_lieu {
	private int NgayPhatHanh;

	public Bao() {
		
	}

	public int getNgayPhatHanh() {
		return NgayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		NgayPhatHanh = ngayPhatHanh;
	}
	
@Override
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		NgayPhatHanh = sc.nextInt();
		
	}
	public void hienthi3() {
		super.hienthi();
		System.out.println("Ngày phát hành:"+getNgayPhatHanh());
	}
}
