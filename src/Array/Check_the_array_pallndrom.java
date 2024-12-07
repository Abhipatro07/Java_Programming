package Array;

import java.util.Scanner;

public class Check_the_array_pallndrom {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        
	        // Declare the array
	        int[] array = new int[size];

	        // Input array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Check if the array is a palindrome
	        boolean isPalindrome = true;
	        for (int i = 0; i < size / 2; i++) {
	            if (array[i] != array[size - i - 1]) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        // Print the result
	        if (isPalindrome) {
	            System.out.println("The array is a palindrome.");
	        } else {
	            System.out.println("The array is not a palindrome.");
	        }
	}

}
