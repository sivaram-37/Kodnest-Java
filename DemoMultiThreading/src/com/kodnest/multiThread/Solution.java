package com.kodnest.multiThread;


//Using Runnable Interface

class PrintNum implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}

		System.out.println();
	}
}

class PrintAlpha implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i='a';i<='j';i++) { 
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
}


public class Solution {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		PrintNum pn = new PrintNum();
		PrintAlpha pa = new PrintAlpha();
		Thread t1=new Thread(pn);
		Thread t2 = new Thread(pa);
		t1.start();
		t2.start();

	}

}
