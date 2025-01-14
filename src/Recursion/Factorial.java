package Recursion;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial: ");
		int n = sc.nextInt();
		
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}

}
