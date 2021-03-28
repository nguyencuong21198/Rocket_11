package bai_tap;

import java.util.Scanner;

public abstract class User {
	private String name;
	private double salary_ratio;
	
	
	
	public User() {
		
	}


	public User(String name, double salary_ratio) {
		
		this.name = name;
		this.salary_ratio = salary_ratio;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary_ratio() {
		return salary_ratio;
	}


	public void setSalary_ratio(double salary_ratio) {
		this.salary_ratio = salary_ratio;
	}

	//khai báo phương thức trừu tượng tên calculatepay()
	public abstract double calculatepay();
	
	
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");	
        this.name = sc.nextLine();
        System.out.println("Salary ratio:");
        this.salary_ratio = sc.nextDouble();
    }


	public void displayInfor() {
		System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary_ratio);
		
	}


	
}
