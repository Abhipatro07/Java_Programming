package Practice;

import java.util.Scanner;

public class Prime_Element_of_the_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The prime elements present in the array is: ");
		for(int i = 0;i<n;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2;i<n/2;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
