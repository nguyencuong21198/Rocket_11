import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
	private int masv;
	private String email;
	private float dtb;

	public Student() {

	}

	public Student(String name, boolean gender, LocalDate dateOfBirth, String address, int masv, String email,
			float dtb) {
		super(name, gender, dateOfBirth, address);
		this.masv = masv;
		this.email = email;
		this.dtb = dtb;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma sinh vien");
		masv = Integer.parseInt(sc.nextLine());
		super.inputInfo();
		System.out.println("Email:");
		email = sc.nextLine();
		System.out.println("Dien trung binh");
		dtb = sc.nextFloat();
	}
@Override
	public void showInfo() {
		System.out.println("Ma sinh vien:" + getMasv());
		super.showInfo();
		System.out.println("Email:" + getEmail());
		System.out.println("Diem trung binh" + getDtb());
	}

	public boolean ishocbong() {
		return dtb >= 8.0;
	}
}
