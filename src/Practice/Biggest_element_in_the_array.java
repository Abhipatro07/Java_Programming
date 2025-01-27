package Practice;

import java.util.*;

public class Biggest_element_in_the_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int big = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i] > big) {
				big = arr[i];
			}
		}
		System.out.println("The largest element in the array is: " + big);
	}

}
