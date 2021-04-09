package Comparing;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private LocalDate ngaysinh;
	private double diem;

	public Student(int id, String name, LocalDate ngaysinh, double diem) {

		this.id = id;
		this.name = name;
		this.ngaysinh = ngaysinh;
		this.diem = diem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ngaysinh=" + ngaysinh + ", diem=" + diem + "]";
	}

	public int compareTo(Student student) {
		if (name.compareTo(student.name) > 0) {
			return 1;
		}

		if (name.compareTo(student.name) < 0) {
			return -1;
		}

		return 0;
	}

}
