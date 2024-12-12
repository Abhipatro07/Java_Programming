package Regular_Expression;

import java.util.regex.Pattern;

public class String_only_alphabet_number {

	public static void main(String[] args) {
		String s = "bgjrbsg54";
		String ex = "[A-Z , a-z , 0-9]*";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
