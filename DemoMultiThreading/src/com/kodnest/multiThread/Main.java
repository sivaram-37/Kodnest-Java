package com.kodnest.multiThread;


//Using Thread Class

class Number extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i+" ");
		}

		System.out.println();
	}
}

class Alphabet extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i='a';i<='j';i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
}


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
