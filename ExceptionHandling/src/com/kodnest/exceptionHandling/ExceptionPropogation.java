package com.kodnest.exceptionHandling;

import java.util.Scanner;

public class ExceptionPropogation {

	public static void main(String[] args) {

		int originalpin=5598;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ATM PIN number :");
		int pin=0;
		try{
			pin=in.nextInt();
			if(pin==originalpin) {
				System.out.println("Balance");
			}
		}
		catch (Exception e) {
			System.out.println("Exception Handled !");
		}
		finally {
			in.close();
			System.out.println("Thank You");	
		}
		
	}

}
