package String;

import java.util.Scanner;

public class Convert_Capital_to_lower_and_lower_to_capital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String ans = " ";
		
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			else {
				ch = (char) (ch - 32);
			}
			
			ans = ans + ch;
		}
		System.out.println(ans);
	}

}
