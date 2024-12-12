package Regular_Expression;

import java.util.regex.Pattern;

public class String_with_special_character {

	public static void main(String[] args) {
		String s = "@bdjb";
		String ex = "[^a-z , ^A-Z , ^0-9].*";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
