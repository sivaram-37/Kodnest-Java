package com.array;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of classes :");
		int r=in.nextInt();
		System.out.println("Enter the number of students :");
		int c=in.nextInt();
		System.out.println("Enter the mark of the students :");
		int[][] m=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				m[i][j]=in.nextInt();
			}
		}
		in.close();
		System.out.println("The marks of the students are :-");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
