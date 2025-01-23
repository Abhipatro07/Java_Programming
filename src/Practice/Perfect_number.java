package Practice;

import java.util.*;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		int temp = x;
		int sum = 0;
		
		for(int i = 1;i<=x/2;i++) {
			if(temp % i == 0) {
				sum = sum + i;
			}
		}
		
		if(x == sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
	}

}
