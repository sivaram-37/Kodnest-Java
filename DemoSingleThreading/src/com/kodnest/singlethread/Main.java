package com.kodnest.singlethread;

class Number{
	void printNum() {
		System.out.println(Thread.currentThread());
		for(int i=1;i<=8;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

class Alphabet{
	void printAlpha() {
		System.out.println(Thread.currentThread());
		for(int i='a';i<='h';i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
}

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Number n = new Number();
		n.printNum();
		Alphabet a = new Alphabet();
		a.printAlpha();

	}

}
