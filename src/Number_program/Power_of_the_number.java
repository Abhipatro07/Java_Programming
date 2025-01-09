package Number_program;

import java.util.*;

public class Power_of_the_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int e = sc.nextInt();
		int ans = 1;
		
		for(int i = 1;i<=e;i++) {
			ans = ans * b;
		}
		
		System.out.println("The ans is: " + ans);
	}

}
