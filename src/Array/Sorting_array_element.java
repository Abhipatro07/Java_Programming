package Array;

import java.util.Scanner;

public class Sorting_array_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number element you want to enter: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
