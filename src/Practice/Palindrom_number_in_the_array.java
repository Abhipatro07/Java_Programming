package Practice;

import java.util.Scanner;

public class Palindrom_number_in_the_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			if(isPalindrom(arr[i])) {
				System.out.println("Palindrom number present in the array is: " + arr[i]);
			}
		}
	}

	public static boolean isPalindrom(int n) {
		int temp = n;
		int rev = 0;
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(rev == n) {
			return true;
		}
		else {
			return false;
		}
	}
}
