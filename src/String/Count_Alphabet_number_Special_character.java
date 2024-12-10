package String;

import java.util.Scanner;

public class Count_Alphabet_number_Special_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		int count1 = 0 , count2 = 0 , count3 = 0;
		
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
				count1++;
			}
			
			else if(ch>='0' && ch<='9') {
				count2++;
			}
			else {
				count3++;
			}
		}
		
		System.out.println("Alphabet is " + count1 + " Number is " + count2 + " Special Character "+ count3);
	}

}
