import java.util.*;

public class LargestOfThreeNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("User!, Enter number for a :");
		int a=in.nextInt();
		System.out.println("User!, Enter number for b :");
		int b=in.nextInt();
		System.out.println("User!, Enter number for c :");
		int c=in.nextInt();
		if(a==b && a==c) {
			System.out.println("All three number are equal");
		}
		else if(a>b && a>c) {
			System.out.println("A is the largest number");
		}
		else if(b>c) {
			System.out.println("B is the largest number");
		}
		else {
			System.out.println("C is the largest number");
		}
		in.close();
	}
}
