package String;

import java.util.Scanner;

public class String_Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		String s2 = " ";
		
		for(int i = s1.length()-1;i>=0;i--) {
			char ch = s1.charAt(i);
			s2 = s2 + ch;
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String is palindrom");
		}
		else{
			System.out.println("String is not palindrom");
		}
	}
}
