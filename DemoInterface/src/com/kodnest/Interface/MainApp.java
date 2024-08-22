package com.kodnest.Interface;

interface StudentActivity{
	void study();
	void eat();
	void sleep();
}
class ComputerScienceStudent implements StudentActivity{
	@Override
	public void study() {
		System.out.println("Studing");
	}

	@Override
	public void eat() {
		System.out.println("Eating");  
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}
}
public class MainApp {

	public static void main(String[] args) {
		ComputerScienceStudent cs = new ComputerScienceStudent();
		cs.study();
		cs.eat();
		cs.sleep();
	}

}
