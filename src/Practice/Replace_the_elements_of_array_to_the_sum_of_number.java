package Practice;

import java.util.*;

public class Replace_the_elements_of_array_to_the_sum_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			int digit = isSumNumber(arr[i]);
			arr[i] = digit;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int isSumNumber(int n) {
		while(n>9) {
			int sum = 0;
			while(n!=0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		return n;
	}

}
