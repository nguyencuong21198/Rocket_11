package bai_tap;

public class Manager extends User {

	

	public Manager() {

	}

	

	public Manager(String name, double salary_ratio) {
		super(name, salary_ratio);
		
	}

	

	@Override
	public double calculatepay() {

		double total_pay;
		double comission;
		comission = getSalary_ratio()*0.42;
		total_pay = this.getSalary_ratio() + comission;
		return total_pay;
	}

	public void display() {
		super.displayInfor();
	}

	public void input() {
		super.input();
	}
}
