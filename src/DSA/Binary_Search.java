package DSA;

import java.util.*;

public class Binary_Search {
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
		int a = search(arr , x);
		if(a<0) {
			System.out.println("Element not present in the list");
		}
		else {
			System.out.println(a);
		}
	}

	public static int search(int[] arr, int x) {
		int l = 0;
		int r = arr.length-1;
		
		while(l <= r) {
			int mid = (l + r) / 2;
			
			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid] > x) {
				r = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		
		return -1;
	}
}
