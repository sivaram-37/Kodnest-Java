import java.util.*;
public class Age {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("User!, Enter the age of a person : ");
		int a=in.nextInt();
		if(a>=0 && a<=12) {
			System.out.println("Child");
		}
		else if(a>=13 && a<=19) {
			System.out.println("Teen");
		}
		else if(a>=20 && a<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
		in.close();
		
	}
}
