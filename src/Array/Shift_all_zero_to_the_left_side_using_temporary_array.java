package Array;

import java.util.Scanner;

public class Shift_all_zero_to_the_left_side_using_temporary_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] n = new int[size];
		
		for(int i = 0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
		
		int[] temp = new int[size];
		int k = 0;
		
		for(int i = 0;i<n.length;i++) {
			if(n[i] != 0) {
				temp[k] = n[i];
				k++;
			}
		}
		System.out.println("Final output is: ");
		for(int i = 0;i<temp.length;i++)
			System.out.println(temp[i]);
	}

}
