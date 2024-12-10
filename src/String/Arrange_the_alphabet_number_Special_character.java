package String;

import java.util.Scanner;

public class Arrange_the_alphabet_number_Special_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alph = " ";
		String num = " ";
		String spc = " ";
		
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				alph = alph + ch;
			}
			else if(ch >= '0' && ch <= '9') {
				num = num + ch;
			}
			else {
				spc = spc + ch;
			}
		}
		
		System.out.println(alph + num + spc);
	}

}
