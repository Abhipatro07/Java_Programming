package Programming_practice;

import java.util.*;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1;i<=n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("It's a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}