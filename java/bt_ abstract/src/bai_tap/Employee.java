package bai_tap;

public class Employee extends User {
	
	
	public Employee() {
		
	}
	public Employee(String name, double salary_ratio) {
		super(name, salary_ratio);
	}
	@Override
	public double calculatepay() {
		
		double total_pay, comision;
		comision = getSalary_ratio()*0.42;
		total_pay  = this.getSalary_ratio()+comision;
		
		return total_pay;
	}
	
	
	public void display() {
		super.displayInfor();
		System.out.println("");
	}
	
	@Override
	public void input() {
		super.input();
	}
	
}
