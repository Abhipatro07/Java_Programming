package Array;

import java.util.Scanner;

public class Sum_of_elements_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] n = new int[size];
		
		for(int i = 0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0;i<n.length;i++) {
			sum = sum + n[i];
		}
		System.out.println("The sum of the array elements: " + sum);
	}

}
