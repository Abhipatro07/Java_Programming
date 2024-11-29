package Programming_practice;

import java.util.*;

public class Duck_umber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		boolean flag = true;
		
		while(n != 0) {
			int rem = n % 10;
			if(rem == 0) {
				System.out.println("It's a Duck Number");
				flag = false;
				break;
			}
			n = n / 10;
		}
		
		if(flag) {
			System.out.println("It is not a Duck Number");
		}
	}

}
