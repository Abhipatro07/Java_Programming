package String;

import java.util.Scanner;

public class Count_the_number_sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence of String: ");
		String s = sc.nextLine();
		s = s + '\0';
		int c = 1;
		
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				c++;
			}
			else {
				System.out.println(s.charAt(i) + " " + c);
				c = 1;
			}
		}
	}

}
