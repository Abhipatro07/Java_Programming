package Practice;

import java.util.*;

public class String_palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		String s2 = "";
		
		for(int i = s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		
		if(s2.equalsIgnoreCase(s1)) {
			System.out.println("This is the palindrom string");
		}
		else {
			System.out.println("This is not the palindrom string");
		}
		
	}

}
