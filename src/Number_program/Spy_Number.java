package Number_program;

import java.util.*;

public class Spy_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		
		while(n != 0) {
			int temp = n % 10;
			sum = sum + temp;
			mul = mul * temp;
			n = n / 10;
		}
		
		if(sum == mul) {
			System.out.println("It's a Spy Number");
		}
		else {
			System.out.println("It is not a Spy Number");
		}
	}

}
