package com.kodnest.singlethreading;


public class Main {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		t.setPriority(9);
		Number n = new Number();
		n.start();
		Alphabet a = new Alphabet();
		a.start();
//		new Addition().start();
		 
	}

}
