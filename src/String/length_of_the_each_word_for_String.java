package String;

import java.util.Scanner;

public class length_of_the_each_word_for_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i].length());
		}
	}

}
