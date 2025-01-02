package Regular_Expression;

import java.util.regex.Pattern;

public class Email_Varification {
	public static void main(String[] args) {
		String s = "abc#123@gmail.com";
		String ex = "[a-z , A-Z]{3,5}#*[0-9]{3,5}@gmail[.]com";
		
		System.out.println(Pattern.matches(ex, s));
	}
	
	
}
