package Practice;

import java.util.Scanner;

public class Factor_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {
			if(x % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

}
