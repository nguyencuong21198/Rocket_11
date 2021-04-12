package lession9;

import lession9.CPU.Processor;


public class Inner {
	public void ques1() {
		CPU cpu = new CPU(10);
		CPU.Ram ram = cpu.new Ram("16", "DELL");
		Processor processor = cpu.new Processor(8, "ASUS");
		System.out.println(ram.getClockSpeed()+":"+processor.getCache());
	}
	public void ques2() {
		Car car = new Car("Mazda","8WD");
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println(car+":"+engine.getEngineType());
	}
}
