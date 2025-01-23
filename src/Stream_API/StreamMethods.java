package Stream_API;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		// filter(predicate)
		List<String> names = List.of("Abhishek" , "Sujit" , "Akash" , "Jitu" , "Santra");
		List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println("Filter method");
		System.out.println("------------------------------------------");
		System.out.println(newName);
		names.stream().forEach(System.out::println);
		System.out.println();
		
		// map(Function)
		List<Integer> num = List.of(23,56,89,78,45);
		List<Integer> sqNum = num.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("Map Method");
		System.out.println("------------------------------------------");
		System.out.println(sqNum);
		sqNum.stream().sorted().forEach(System.out::println);;
		
	}
}
