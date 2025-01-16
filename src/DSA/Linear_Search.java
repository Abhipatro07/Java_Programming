package DSA;

import java.util.*;

public class Linear_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[n];
		for(int i = 0;i<=n-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a ineteger to search: ");
		int x = sc.nextInt();
		
		System.out.println("Entered element is in the index: ");
		int a = find(arr , x);
		if(a<0) {
			System.out.println("Element not present in the list");
		}
		else {
			System.out.println(a);
		}
	}

	public static int find(int[] arr, int x) {
		for(int i = 0;i<=arr.length-1;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
