package com.kodnest.adstraction;


abstract class Car{
	
	public void start() {
		System.out.println("Vehicle is Starting");
	}
	
	public void stop() {
		System.out.println("Vehicle is Stopped");
	}
	
	abstract void refuel();
	
}

class ElectricCar extends Car{

	@Override
	void refuel() {
		System.out.println("Charging the car's battery");
	}
	
}
class PetrolCar extends Car{
	void refuel() {
		System.out.println("Filling up with petrol");
	}
}

class DieselCar extends Car{

	@Override
	void refuel() {
		System.out.println("Filling up with Diesel");
	}
	
}



public class MainApp {

	public static void main(String[] args) {
		
		ElectricCar ec = new ElectricCar();
//		ec.start();
//		ec.stop();
//		ec.refuel();
		
		PetrolCar pc = new PetrolCar();
//		pc.start();
//		pc.stop();
//		pc.refuel();
		
		DieselCar dc = new DieselCar();
//		dc.start();
//		dc.stop();
//		dc.refuel();[
		
		MainApp s = new MainApp();
		s.drive(ec);
		s.drive(pc);
		s.drive(dc);
		
	}

	void drive(Car c) {
		c.start();
		c.stop();
		c.refuel();
		
	}

}
