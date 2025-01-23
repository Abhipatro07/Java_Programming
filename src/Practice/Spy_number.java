package Practice;

import java.util.*;

public class Spy_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int sum = 0 , pro = 1;
		
		while(x != 0) {
			int rem = x % 10;
			sum = sum + rem;
			pro = pro * rem;
			x = x / 10;
		}
		
		if(sum == pro) {
			System.out.println("It is the Spy Number");
		}
		else {
			System.out.println("It is not a Spy Number");
		}
	}
}
