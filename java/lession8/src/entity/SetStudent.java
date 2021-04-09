package entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStudent {
	Set<Student> students = new HashSet<Student>();

	public void input() {
		students.add(new Student(1, "Nam"));
		students.add(new Student(2, "Dat"));
		students.add(new Student(3, "Cuong"));
		students.add(new Student(4, "Vui"));
		students.add(new Student(5, "Cuong"));
		students.add(new Student(6, "Dung"));
		students.add(new Student(7, "Cuong"));
		students.add(new Student(8, "Dung"));
		students.add(new Student(9, "Cuong"));
		students.add(new Student(10, "Dung"));
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

	// lay phan tu thu 4
	public void get4Student() {
		Iterator<Student> iterator = students.iterator();
		for (int i = 0; i < 1; i++) {
			iterator.next();
		}
		System.out.println("Student thu 4:" + iterator.next());
	}

	// Student dau va cuoi
	public void daucuoi() {
		Iterator<Student> iterator = students.iterator();
		System.out.println("Student dau tien:" + iterator.next());
		for (int i = 0; i < students.size() - 2; i++) {
			iterator.next();
		}
		System.out.println("Student cuoi cung la:" + iterator.next());
	}

	// dao nguoc student
	public void daonguoc() {
	}
}
