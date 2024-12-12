package Regular_Expression;

import java.util.regex.Pattern;

public class Phone_number_starts_with_6_7_8_9 {

	public static void main(String[] args) {
		String s = "6842348942";
		String ex = "[6-9][0-9]{9}";
		
		System.out.println(Pattern.matches(ex, s));
	}

}
