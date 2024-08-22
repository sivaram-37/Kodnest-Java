package org.kodnest.bean;

public class Product {
	int pid;
	String pname;
	public Product() {
		super();
		System.out.println("0-Para-constructor");
	}
	public Product(int pid, String pname) {
		super();
		System.out.println("Para-constructor");
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		System.out.println("getter id");
		return pid;
	}
	public void setPid(int pid) {
		System.out.println("setter id");
		this.pid = pid;
	}
	public String getPname() {
		System.out.println("getter name");
		return pname;
	}
	public void setPname(String pname) {
		System.out.println("setter name");
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	

}
