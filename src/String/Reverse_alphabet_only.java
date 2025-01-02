package String;

import java.util.Scanner;

public class Reverse_alphabet_only {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wirte a String: ");
		String s = sc.nextLine();
		String rev = " ";
		
		for(int i = s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			
			if((c>='A' && c<='Z') || (c>='a' &&c<='z')) {
				rev = rev + s.charAt(i);
			}
		}
		
		String ans = " ";
		int k = 1;
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if((c>='A' && c<='Z') || (c>='a' &&c<='z')) {
				ans = ans + rev.charAt(k);
				k++;
			}
			
			else {
				ans = ans + s.charAt(i);
			}
		}
		
		System.out.println(ans);
		
	}

}
