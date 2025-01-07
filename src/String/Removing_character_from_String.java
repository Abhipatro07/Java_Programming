package String;

import java.util.Scanner;

public class Removing_character_from_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int l = 0;
		int r = s.length()-1;
		
		for(int i = 0;i<s.length();i++) {
			String temp = "";
			
			if(i%2 == 0) {
				l++;
			}
			else {
				r--;
			}
			
			for(int j = l; j<=r;j++) {
				temp = temp + s.charAt(j);
			}
			System.out.println(temp);
		}
	}

}
