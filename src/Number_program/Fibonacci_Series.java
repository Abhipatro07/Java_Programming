package Number_program;

import java.util.*;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which the number you want to print: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for(int i = 0;i<=n;i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}
	}

}
