package entity;

import java.util.Scanner;

public class HinhTron implements Ihinh {
	private double bankinh;

	public HinhTron() {
		bankinh = 0;
	}

	public HinhTron(double r) {
		bankinh = r;
	}

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double r) {
		if (r > 0)
			bankinh = r;
		else
			bankinh = 0;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập bán kính:");
        bankinh = nhap.nextDouble();
	}

	@Override
	public void hienthi() {
		// TODO Auto-generated method stub
		System.out.println("Bán kình hình tròn là: " + bankinh);
	}

	@Override
	public double chuvi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*bankinh;
	}

	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(bankinh, 2);
	}

}
