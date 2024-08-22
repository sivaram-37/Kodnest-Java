package com.kodenst.pc;

public class Demo {

	public static void main(String[] args) {
		Factory f = new Factory();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
		Thread t1=new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}

class Producer implements Runnable{
	Factory f;
	public Producer(Factory f) {
		this.f=f;
	}
	public void run() {
		int i=0;
		while(true) {
			f.produce(i++);
		}
	}
}

class Consumer implements Runnable{
	Factory f;
	public Consumer(Factory f) {
		this.f=f;
	}
	public void run() {
		while (true) {
			f.consume();
		}

	}
}

class Factory{
	int num;
	boolean status=false;
	public synchronized void produce(int num) {
		try {
			if(!status) {
				this.num=num;
				System.out.println("Produced item = "+num);
				status=true;
				notify();
			}
			else {
				wait();
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void consume(){
		try {
			if(status) {
				System.out.println("Consumed item = "+num);
				status=false;
				notify();
			}
			else {
				wait();
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}


