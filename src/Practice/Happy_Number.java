package Practice;

import java.util.*;

public class Happy_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int digit = sumOfDigit(x);
		
		if(digit == 1 || digit == 7) {
			System.out.println("It is a Happy Number");
		}
		else {
			System.out.println("It is not a Happy Number");
		}
		
	}
	
	public static int sumOfDigit(int x) {
		while(x > 9) {
			int sum = 0;
			while(x != 0) {
				int rem = x % 10;
				sum = sum + rem * rem;
				x =x / 10;
			}
			x = sum;
		}
		return x;
	}
}
