package Regular_Expression;

import java.util.regex.Pattern;

public class String_start_with_A {

	public static void main(String[] args) {
		String s = "Apple";
		String ex = "A.*";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
