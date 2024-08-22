
import java.util.Scanner;

public class UpperOrLoweCase {	
	static String isVowel(char i) {
		if(i=='A' || i=='a' || i=='E' || i=='e' || i=='I' || i=='i' || i=='O' || i=='o' || i=='U' 
				|| i=='u') {
			return "Vowel";
		}
		else {
			return "Consonent";
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("User! Enter a character : ");
		char ch=in.next().charAt(0);
		
		if(Character.isUpperCase(ch)==true) {
			System.out.print("Upper Case "+isVowel(ch));
		}
		else {
			System.out.println("Lower Case "+isVowel(ch));
			
		}
		in.close();
	}
}
