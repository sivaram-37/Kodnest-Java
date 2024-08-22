package com.kodnest.staticKeyword;

class Demo{
	
	/*static int a=10;
	int b=40;
	static void display1() {
		System.out.println("non-static method");
	}
	void display2() {
		System.out.println("staic method");
	}*/
	
	//static & Non-static block
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Non-Static block");
	}
}

public class App1 {
	public static void main(String[] args) {
		//
		/*System.out.println(Demo.a);
		Demo.display1();
		Demo n = new Demo();
		System.out.println(n.b);
		n.display2();*/
		
		//static & Non-static block
		new Demo();
		new Demo();
		new Demo();	
		
	}

}
