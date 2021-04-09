package entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private static int idCounter = 0;

	public Student(String name) {
		this.name = name;
	}

	public Student() {
		this.id = idCounter++;
		input();
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

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name:");
		name = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
