package Regular_Expression;

import java.util.regex.Pattern;

public class String_only_alphabet {

	public static void main(String[] args) {
		String s = "dshbfsdb";
		String ex = "[A-Z , a-z]*";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
