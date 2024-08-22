// Using Comparator and Comparable interfaces

package com.kodnest.collectionFamework;

import java.util.*;

class Product implements Comparable<Product>{
	String pname;
	int pid;
	int price;
	public Product(String pname, int pid, int price) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pid=" + pid + ", price=" + price + "]";
	}
	
	//Using Comparator - Ascending Order
	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		return this.price -other.price;
	}
	
	//Using Comparable - Descending Order
//	@Override
//	public int compareTo(Product other) {
//		// TODO Auto-generated method stub
//		return other.price - this.price;
//	}
	
}

//Using Comparator - Ascending Order
class AscComparator implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return Integer.compare(o1.price, o2.price);
	}
}

//Using Comparator - Descending Order
class DesComparator implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price>o2.price) {
			return -1;
		}
		else if(o1.price<o2.price) {
			return 1;
		}
		return 0;
	}
}

class AscComparable{
	

	
}

public class Exp2SortingObjects {
	public static void main(String[] args) {
		Product p1=new Product("Mari Gold",20103,30);
		Product p2=new Product("Milk Biscuit",23423,10);
		Product p3=new Product("Dairy Milk Silk",34157,180);
		Product p4=new Product("5 Star Gold",14345,30);
		Product p5=new Product("Surf excel",13246,140);
		
		List<Product> a=new ArrayList<Product>();
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		
		System.out.println("<<<  Using Comparator >>>");
		System.out.println("<-- Ascending Order -->");
		Collections.sort(a,new AscComparator());
		System.out.println(a);
		System.out.println("<-- Descending Order -->");
		Collections.sort(a,new DesComparator());
		System.out.println(a);
		
		System.out.println("<<<  Using Comparable  >>>");
		Collections.sort(a);
		System.out.println(a);
	}
}
