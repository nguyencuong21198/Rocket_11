package Comparing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Question1Question2 {
	ArrayList<Student> students = new ArrayList<Student>();

	public void input() {
		students.add(new Student(1, "Nam", LocalDate.parse("2019-12-20"), 8));
		students.add(new Student(2, "Hang", LocalDate.parse("2020-10-20"), 5));
		students.add(new Student(3, "Linh", LocalDate.parse("2015-01-01"), 9));
		students.add(new Student(4, "Dang", LocalDate.parse("2010-05-30"), 7));
		students.add(new Student(5, "Dang", LocalDate.parse("2021-04-08"), 6));
		System.out.println("Danh sach student vua khoi tao: ");
		show();
	}

	public void show() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	//sap xep theo name
	public void sapxep() {
		
	}

}
