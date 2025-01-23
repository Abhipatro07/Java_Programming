package Practice;

import java.util.*;

public class Count_the_Even_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int c = 0;
		
		while(x != 0) {
			int rem = x % 10;
			if(rem % 2 == 0) {
				c++;
			}
			x = x / 10;
		}
		System.out.println("The number of even number is: " + c);
	}

}
