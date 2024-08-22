package com.kodnest.singlethreading;

public class Alphabet extends Thread {
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
