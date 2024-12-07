package Array;

import java.util.Scanner;

public class Taking_array_at_runtime_from_the_user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements you want to add");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int[] n = new int[size];
		
		for(int i = 0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
		
		System.out.println("Show the Array Element");
		
		for(int i =0;i<n.length;i++) {
			System.out.println("Index Value: " + i + " Data: " + n[i]);
		}
	}

}
