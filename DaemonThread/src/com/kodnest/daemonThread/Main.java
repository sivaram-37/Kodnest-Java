package com.kodnest.daemonThread;

class Typing extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Typing");
			
		}
	}
}
class AutoSuggestion extends Thread{ 
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AutoSuggestion");
		}
	}
	
}
class AutoCorrection extends Thread{
	public void run() {
		while (true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AutoCorrection");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		Typing ty = new Typing();
		AutoSuggestion as = new AutoSuggestion();
		AutoCorrection ac = new AutoCorrection();
		
		as.setDaemon(true);
		ac.setDaemon(true);
		as.setPriority(1);
		ac.setPriority(1);
		
		ty.start();
		as.start();
		ac.start();
	}

}
