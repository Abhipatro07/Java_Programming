package String;

import java.util.Scanner;

public class Convert_String_into_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		char[] arr = new char[s.length()];
		
		for(int i = 0;i<s.length();i++) {
			arr[i] = s.charAt(i);
			System.out.println(arr[i]);
		}
	}

}
