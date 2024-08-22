package com.kodnest.aggregation;


class Pilot{
	String name;
	public Pilot(String name) {
		this.name = name;
	}
	void fly() {
		System.out.println(name + " is flying the plane");
	}
	
}
class Airlines{
	String airname;
	Pilot p;
	public Airlines(String airname,Pilot p) {
		this.airname = airname;
		this.p=p;
	}
	void operate() {
		System.out.println("Operating");
		p.fly();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilot siva = new Pilot("Siva");
		Airlines a = new Airlines("Alpha-1",siva);
		a.operate();
		a=null;
		siva.fly();
	}

}
