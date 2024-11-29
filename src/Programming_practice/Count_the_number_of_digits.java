package Programming_practice;

import java.util.*;

public class Count_the_number_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		
		while(n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("The digits in the number is: " + count);
	}

}
