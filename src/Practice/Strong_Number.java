package Practice;

import java.util.*;

public class Strong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int temp = x;
		int fact = 1;
		int sum = 0;
		
		while(temp != 0) {
			int rem = temp % 10;
			for(int i = 1;i<=rem;i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp / 10;
			fact = 1;
		}
		
		if(x == sum) {
			System.out.println("It is a Strong Number");
		}
		else {
			System.out.println("It is not Strong Number");
		}
	}
}
