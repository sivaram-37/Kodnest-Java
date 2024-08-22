package com.kodnest.exceptionHandling;

import java.util.*;

public class DemoException {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=0;
		int[] a=null;
		try{
			n=in.nextInt();
			a=new int[n];
			System.out.println("Please,enter an index number");
			int ind=in.nextInt();
			System.out.println(a[ind]);
		}
		catch (InputMismatchException e1) {
			System.out.println("! Please enter integer value !");
		}
		catch(NegativeArraySizeException e2) {
			System.out.println("! Please enter positive value !");
		}
		catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("! Please enter the index value greater than -1 and less than array length of "+n);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		in.close();
		
	}

}
