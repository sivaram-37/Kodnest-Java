/*
The program must accept two lines of N integers each as the input. The program must print the odd 
integers from both the lines based on their order of occurrences as the output. If both lines having 
odd integers in the same position then print the odd integer from the first line followed by the odd 
integer from the second line.

Proceed to Solve the Program
Boundary Condition(s):
1 <= N <= 100
1 <= Each integer value <= 1000

Input Format:
The first line contains N.
The second line contains N integers separated by a space.
The third line contains N integers separated by a space.
Output Format:
The first line contains the odd integers based on their order of occurrences.
Example Input/Output 1:

Input:
5
11 10 12 13 77
45 44 44 43 10
Output:
11 45 13 43 77
Explanation:
The odd integers in the 1st line are 11 13 and 77. The odd integers in the 2nd list are 45 and 43.
So, those odd integers are printed based on their order of occurrences. 
Hence the output is 11 45 13 43 77
Example Input/Output 2:
Input:
6
12 11 14 13 10 20
8 15 24 22 13 19
Output:
11 15 13 13 19
 */



package com.skillrack;
import java.util.*;
public class DailyChallenge1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
		int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
        	a.add(sc.nextInt());
        }
        for(int j=0;j<n;j++) {
        	b.add(sc.nextInt());
        }
        for(int i=0;i<n;i++) {
        	if(a.get(i)%2!=0) {
        		System.out.print(a.get(i)+" ");
        	}
        	if(b.get(i)%2!=0) {
        		System.out.print(b.get(i)+" ");
        	}
        }
        sc.close();
        
	}

}
