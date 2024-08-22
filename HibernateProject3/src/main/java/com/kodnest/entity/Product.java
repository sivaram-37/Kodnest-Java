package com.kodnest.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	int pid;
	String pname;

	@ManyToMany
	List<Customer> customer;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, List<Customer> customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", customer=" + customer + "]";
	}

}
