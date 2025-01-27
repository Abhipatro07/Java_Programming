package Practice;

import java.util.*;

public class Frequency_of_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer , Integer> frequency = new HashMap<Integer, Integer>();
		
		// using the getOrDefault method
//		for(int num : arr) {
//			frequency.put(num, frequency.getOrDefault(num , 0) + 1);
//		}
		
		// without using the getOrDefault()
		for (int num : arr) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }
		
		System.out.println("Element frequency in the array");
		for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
		}
		
	}

}
