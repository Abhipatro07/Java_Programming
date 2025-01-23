package Practice;

import java.util.*;

public class Sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int sum = 0;
		
		while(x != 0) {
			int rem = x % 10;
			sum = sum + rem;
			x = x / 10;
		}
		
		System.out.println("The sum of the digits: " + sum);
	}

}
