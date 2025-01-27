package Practice;

import java.util.Scanner;

public class Sum_of_the_array_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i = 0;i<n;i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of the array elements are: " + sum);
	}

}
