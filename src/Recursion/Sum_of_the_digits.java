package Recursion;

import java.util.*;

public class Sum_of_the_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return n + sum(n-1);
		}
	}

}
