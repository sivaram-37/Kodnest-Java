package com.kodnest.ce;


class MyException extends Exception{
	public MyException() {
		System.out.println("Too much of screen time,please stop using Instagram");
	}
}

public class Demo {

	public static void main(String[] args) throws MyException {
		UsingInstagram();

	}

	static void UsingInstagram() throws MyException {
		int time=0;
		for(;time<=10;time++) {
			System.out.println("Use Instagram");
		}
		if(time>10) {
			throw new MyException();
		}
		
	}

}
