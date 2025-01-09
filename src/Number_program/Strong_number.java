package Number_program;

import java.util.*;

public class Strong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int fact = 1;
		
		while(n != 0) {
			int rem = n % 10;
			
			for(int i = 1;i<=rem;i++) {
				fact = fact * i;
			}
			
			sum = sum + fact;
			n = n / 10;
			fact = 1;
		}
		if(sum == temp) {
			System.out.println("Its a Strong number");
		}
		else {
			System.out.println("It is not a Strong Number");
		}
	}

}
