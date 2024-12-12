package Regular_Expression;

import java.util.regex.Pattern;
public class String_startrs_with_number {

	public static void main(String[] args) {
		String s = "25jdcbhjh";
		String ex = "[0-9].*";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
