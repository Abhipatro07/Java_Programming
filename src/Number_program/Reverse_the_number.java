package Number_program;

import java.util.*;

public class Reverse_the_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int reversedNumber = 0;
		
		while(n!=0) {
			int digit = n % 10;
			reversedNumber = reversedNumber * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reversed Number is: " + reversedNumber);
	}

}
