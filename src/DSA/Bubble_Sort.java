package DSA;

import java.util.*;

public class Bubble_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[n];
		for(int i = 0;i<=n-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting elements are");
		for(int i = 0;i<=n-1;i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr1 = sort(arr);
		System.out.println("After sorting elements are: ");
		for(int i = 0;i<=n-1;i++) {
			System.out.println(arr1[i]);
		}
	}

	public static int[] sort(int[] arr) {
		for(int i = 0;i<=arr.length;i++) {
			boolean flag = false;
			
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == false) {
				break;
			}
		}
		return arr;
	}
}
