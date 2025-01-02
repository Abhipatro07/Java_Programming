package String;

import java.util.Scanner;

public class Reverse_all_even_length_word_of_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].length() % 2 == 0) {
				System.out.println(reverseString(arr[i]) + " ");
			}
			else {
				System.out.println(arr[i] + " ");
			}
		}
	}

	public static String reverseString(String string) {
		String rev = " ";
		
		for(int i = string.length()-1;i>=0;i--) {
			rev = rev + string.charAt(i);
		}
		return rev;
	}

}
