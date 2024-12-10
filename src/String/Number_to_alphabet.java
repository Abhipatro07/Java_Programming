package String;

import java.util.Scanner;

public class Number_to_alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		String ans = " ";
		String arr[] = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"};
		int rem = 0;
		
		while(n != 0) {
			rem = n % 10;
			ans = arr[rem] + ans;
			n = n / 10;
		}
		System.out.println(ans);
		
		
	} 

}
