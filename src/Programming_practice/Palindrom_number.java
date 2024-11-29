package Programming_practice;

import java.util.*;

public class Palindrom_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = 0;
		int rem = 0;
		
		while(n != 0) {
			rem = n % 10;
			rem = temp + rem;
			temp = rem * 10;
			n = n / 10;			
		}
		
		if(rem == n) {
			System.out.println("It's a palindrom number");
		}
		else {
			System.out.println("It is not a palindrom number");
		}
	}

}
