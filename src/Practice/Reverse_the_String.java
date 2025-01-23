package Practice;

import java.util.*;

public class Reverse_the_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		String s2 = "";
		
		for(int i = s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}
}
