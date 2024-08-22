package com.kodnest.cc;
import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number 1:");
		int a=in.nextInt();
		System.out.print("Enter number 2:");
		int b=in.nextInt();
		System.out.print("Enter the operator :");
		char ch=in.next().charAt(0);
		switch(ch) {
		case '+':System.out.println(a+b); break;
		case '-':System.out.println(a-b); break;
		case '*':System.out.println(a*b); break;
		case '/':System.out.println(a/b); break;
		case '%':System.out.println(a%b); break;
		default:System.out.println("Invalid character");
		in.close();
		}

	}

}
