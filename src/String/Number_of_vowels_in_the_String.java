package String;

import java.util.Scanner;

public class Number_of_vowels_in_the_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n = sc.nextLine();
		n = n.toUpperCase();
		int c = 0;
		
		for(int i = 0;i<n.length();i++) {
			char ch = n.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				c++;
			}
		}
		System.out.println(c);
	}

}
