package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Student;

public class Ques1 {
	Scanner sc = new Scanner(System.in);
	private Student[] students;

	public void listStudent() {
		students = new Student[5];
		students[0] = new Student("Nguyễn Văn A");
		students[1] = new Student("Nguyễn Văn B");
		students[2] = new Student("Nguyễn Văn C");
		students[3] = new Student("Nguyễn Văn D");
		students[4] = new Student("Nguyễn Văn E");
		}
	public void hienthi() {
		for(Student student:students) {
			System.out.println(student);
		}
	}
	public void deleteStudent() {
		for(Student student:students) {
		}
	}
}
