package com.vti.frontend;

import com.vti.entity.Student;

public class Test {
	public static void main(String[] args) {
		Student student =new Student(12, "cuong", "nna");
		student.themDiem(7.0);
		student.showStudent();
	}
}
