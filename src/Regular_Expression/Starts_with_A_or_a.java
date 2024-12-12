package Regular_Expression;

import java.util.regex.Pattern;

public class Starts_with_A_or_a {

	public static void main(String[] args) {
		String s = "Abhi";
		String ex = "[A , a].*";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
