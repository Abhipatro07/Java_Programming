package Stream_API;

import java.util.*;
import java.util.stream.*;

public class StreamObject {

	public static void main(String[] args) {
		
		// blank stream
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println(e);
		});
		
		// Array / Object / Collection
		String names[] = {"Abhi" , "Sujit" , "Akash"};
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		// builder pattern
		Stream<Object> streamBuilder = Stream.builder().build();
		
		// Arrays class
		IntStream stream2 = Arrays.stream(new int[] {1,2,5,8,9,6});
		stream2.forEach(e -> {
			System.out.println(e);
		});
		
		// List , Set
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(69);
		l1.add(74);
		l1.add(54);
		l1.add(75);
		
		Stream<Integer> stream3 = l1.stream();
		stream3.forEach(e -> {
			System.out.println(e);
		});
	}

}
