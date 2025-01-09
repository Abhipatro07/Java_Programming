package Number_program;

import java.util.*;

public class Print_the_digit_of_a_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		while(n != 0) {
			int temp = n % 10;
			System.out.println(temp);
			n = n / 10;
		}
		System.out.println();
	}
}
