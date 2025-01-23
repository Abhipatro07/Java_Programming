package Stream_API;

import java.util.*;
import java.util.stream.*;

public class StreamMain {
	public static void main(String[] args) {
		// Create a List and filter all the even number from the List
		
		List<Integer> l1 = List.of(2,5,3,6,9);
		
		// without stream
		List<Integer> listEven = new ArrayList<Integer>();
		for(Integer i : l1) {
			if(i%2 == 0) {
				listEven.add(i);
			}
		}
		
		System.out.println("Without using Stream API");
		System.out.println("------------------------------------");
		System.out.println(l1);
		System.out.println(listEven);
		System.out.println();
		
		// with stream
//		Stream<Integer> stream = l1.stream();
//		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		List<Integer> newList = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("With using Stream API");
		System.out.println("------------------------------------");
		System.out.println(newList);
		System.out.println();
		
		// find the number which is greater than 5
		List<Integer> newList1 = l1.stream().filter(i -> i > 5).collect(Collectors.toList());
		System.out.println("find the number which is greater than 5");
		System.out.println("---------------------------------------------------");
		System.out.println(newList1);
		
	}
}





















