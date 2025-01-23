package Practice;

import java.util.Scanner;

public class Product_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int pro = 1;
		
		while(x != 0) {
			int rem = x % 10;
			pro = pro * rem;
			x = x / 10;
		}
		
		System.out.println("Product of digits is: " + pro);
	}

}
