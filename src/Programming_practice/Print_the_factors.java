package Programming_practice;

import java.util.*;

public class Print_the_factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}
}