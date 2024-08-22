package com.kodnest.entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Customer {
	@Id
	int cid;
	String cname;
	
	@ManyToMany
	List<Product> product;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, List<Product> product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", product=" + product + "]";
	}
}
