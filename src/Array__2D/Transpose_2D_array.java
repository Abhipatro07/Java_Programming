package Array__2D;

import java.util.*;

public class Transpose_2D_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		System.out.println("Enter the values to 2D Array: ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Before transpose: ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i + 1;j<arr[i].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		System.out.println("After transpose: ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
