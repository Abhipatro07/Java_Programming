package Programming_practice;

import java.util.*;

public class Greatest_of_3_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a: ");
		int a = sc.nextInt();
		System.out.println("Enter the number b: ");
		int b = sc.nextInt();
		System.out.println("Enter the number c: ");
		int c = sc.nextInt();
		
		int res = a>b?a>c?a:c:b>c?b:c;
		
		System.out.println("The largest number among the 3 is: " + res);
	}

}