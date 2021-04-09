package entity;

import java.util.Scanner;

public class Hinhvuong implements Ihinh {
	private double canh;
	public Hinhvuong()
    {
        canh =0;
    }
    public Hinhvuong( double d)
    {
        canh = d;
       
    }
    public double getCanh() {
        return canh;
    }
    public void getCanh(double d){
        if(d>0)
            canh = d;
        else
            canh =0;
    }
	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập cạnh hình vuông:");
        canh = nhap.nextDouble();
	}

	@Override
	public void hienthi() {
		// TODO Auto-generated method stub
		 System.out.println("Cạnh hình vuông: " + getCanh());
	}

	@Override
	public double chuvi() {
		// TODO Auto-generated method stub
		return getCanh()*4; 
	}

	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return getCanh()*getCanh();
	}

}
