package com.kodnest.singlethreading;

public class Number extends Thread {
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
