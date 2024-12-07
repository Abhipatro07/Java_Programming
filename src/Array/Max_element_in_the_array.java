package Array;

import java.util.Scanner;

public class Max_element_in_the_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] n = new int[size];
		
		for(int i = 0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
		
		int max = n[0];
		
		for(int i = 0;i<n.length;i++) {
			if(max<n[i]) {
				max = n[i];
			}
		}
		
		System.out.println("The Max element in the array is: " + max);
	}

}
