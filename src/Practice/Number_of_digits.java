package Practice;

import java.util.*;

public class Number_of_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int c = 0;
		
		while(x != 0) {
			int rem = x % 10;
			c++;
			x = x/10;
		}
		
		System.out.println(c);
	}
}
