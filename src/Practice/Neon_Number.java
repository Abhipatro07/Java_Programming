package Practice;

import java.util.Scanner;

public class Neon_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int y = x*x;
		int sum = 0;
		
		while(y != 0) {
			int rem = y % 10;
			sum = sum + rem;
			y = y / 10;
		}
		if(x == sum) {
			System.out.println("It is a Neon Number");
		}
		else {
			System.out.println("It is not a Neon Number");
		}
		
	}
}
