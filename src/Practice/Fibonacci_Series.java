package Practice;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 1;i<=x;i++) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
		}
	}
}
