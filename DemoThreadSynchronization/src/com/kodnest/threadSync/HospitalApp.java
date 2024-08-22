package com.kodnest.threadSync;

public class HospitalApp {

	public static void main(String[] args) {

		Hospital h = new Hospital();
		Thread t1 = new Thread(h);
		t1.setName("Engineer");
		t1.start();
		Thread t2 = new Thread(h);
		t2.setName("Lawyer");
		t2.start();
	}

}

class Hospital implements Runnable{
	public synchronized void run() {
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+" is in ICU");
			Thread.sleep(2000);
			System.out.println(name+" is getting treatment");
			Thread.sleep(2000);
			System.out.println(name+" is discharged");
		} 
		catch (InterruptedException e) {
			System.out.println("Exception Handled");
		}
	}
}