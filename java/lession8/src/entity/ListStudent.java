package entity;

import java.util.ArrayList;
import java.util.Scanner;

public class ListStudent {
	ArrayList<Student> students = new ArrayList<>();

	// Scanner sc = new Scanner(System.in);
	public void input() {
		students.add(new Student(1, "Nam"));
		students.add(new Student(2, "Dat"));
		students.add(new Student(3, "Cuong"));
		students.add(new Student(4, "Vui"));
		students.add(new Student(5, "Cuong"));
		students.add(new Student(6, "Dung"));
	}

	public void show() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
// tong so phan tu cua mang
	public void printStudent() {
		System.out.println("Tong so phan tu cua mang:" + students.size());
	}
	
	//lay phan tu thu 4
	public void get4Student() {
		System.out.println("Student thu 4 la:"+students.get(3));
	}
	// in phan tu dau vaf cuoi
	public void daucuoi(){
		System.out.println("Student dau tien:"+students.get(0));
		System.out.println("Student cuoi:"+students.get(students.size()-1));
	}
	//them phan tu vao vi tri dau
	public void addStudens() {
		students.add(new Student(0,"Thanh"));
		System.out.println("Danh sach student sau khi them vao vi tri dau:");
		show();
	}
	//them phan tu vao vi tri cuoi
	public void addStudens1() {
		students.add(new Student(7,"Ngan"));
		System.out.println("Danh sach student sau khi them vao vi tri cuoi:");
		show();
	}
	//dao nguoc vi tri
	
	//tim kiem theo id
	public void searchId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id cần tìm:");
		int id = sc.nextInt();
		for(Student student:students) {
			if(student.getId()==id) {
				System.out.println(student);
			}
		}
	}
	
	//tim kiem theo name
	public void searchName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập name cần tìm:");
		String name = sc.nextLine();
		for(Student student:students) {
			if(student.getName().equals(name)) {
				System.out.println(student);
			}
		}
	}
	//in ra cac phan tu trung ten
	//xoa ten phan tu co id=2
	public void deleteNameId2() {
		for(Student student:students) {
			if(student.getId()==2) {
				student.setName(null);
			}
		}
		System.out.println("Danh sach student sau khi xoa");
		show();
	}
	//xoa phan tu co is=5
	public void deleteStudentId5() {
		for(Student student:students) {
			if(student.getId()==5) {
				students.remove(student);
			}
		}
	}
	
	
}
