package Programming_practice;

import java.util.*;

public class Sum_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number upto that the sum will be done: ");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n >= 1){
			sum = sum + n;
			n--;
		}
		System.out.println("The sum is: " + sum);
	}

}
