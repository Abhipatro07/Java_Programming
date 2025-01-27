package Practice;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		if(isPrime(x)) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is not a Prime Number");
		}
	}

	public static boolean isPrime(int x) {
		if(x <= 1) {
			return false;
		}
		else {
			for(int i = 2;i<x/2;i++) {
				if(x % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
