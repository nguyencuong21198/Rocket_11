package bai_tap;

public class Waiter extends User {
	public Waiter() {	
		}

	public Waiter(String name, double salary_ratio) {
		super(name, salary_ratio);
	}

	@Override
	public double calculatepay() {

		double total_pay, comision;
		comision = getSalary_ratio() * 0.22;
		total_pay = this.getSalary_ratio() + comision;

		return total_pay;
	}

	public void display() {
		super.displayInfor();
	}

	public void input() {
		super.input();
	}
}
