package Practice;

import java.util.*;

public class Palindrom_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int temp = x;
		int rev = 0;
		
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(x == rev) {
			System.out.println("It is a palindrom number");
		}
		else {
			System.out.println("It is not a palindrom number");
		}
	}

}
