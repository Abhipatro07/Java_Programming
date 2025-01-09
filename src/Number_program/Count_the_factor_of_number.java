package Programming_practice;

import java.util.Scanner;

public class Count_the_factor_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1;i<=n;i++) {
			if(n%i == 0) {
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println("The number of the factors in the given number: " + count);
	}
}
