package bai_tap;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Vector<User> us = new Vector<User>();
		us.add(new Employee());
		us.add(new Manager());
		us.add(new Waiter());
		
		System.out.println("Nhập thông tin các user");
		for(User u:us) {
			u.input();
		}
		
		System.out.println("Thông tin các user");
		for(User u:us) {
			u.displayInfor();
			System.out.println("Total pay:"+u.calculatepay());
		}
	}
}
