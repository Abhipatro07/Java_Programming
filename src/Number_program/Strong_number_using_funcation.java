package Number_program;

import java.util.*;

public class Strong_number_using_funcation {
	public static int factorial(int x) {
		int fact = 1;
		for(int i = 1;i<=x;i++) {
			fact = fact * i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(n != 0) {
			int rem = n % 10;
			sum = sum + factorial(rem);
			n = n / 10;
		}
		if(sum == temp) {
			System.out.println("It's Strong Number");
		}
		else {
			System.out.println("It is not a Strong Number");
		}
		
	}
}
