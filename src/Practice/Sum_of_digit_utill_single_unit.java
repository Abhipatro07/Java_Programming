package Practice;

import java.util.Scanner;

public class Sum_of_digit_utill_single_unit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int digit = sumOfDigit(x);
		System.out.println(digit);
	}
	
	public static int sumOfDigit(int x) {
		while(x > 9) {
			int sum = 0;
			while(x != 0) {
				int rem = x % 10;
				sum = sum + rem;
				x =x / 10;
			}
			x = sum;
		}
		return x;
	}

}
