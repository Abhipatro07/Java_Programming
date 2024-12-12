package Regular_Expression;

import java.util.regex.Pattern;

public class String_is_with_D {

	public static void main(String[] args) {
		String s = "D";
		String ex = ".*D";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
