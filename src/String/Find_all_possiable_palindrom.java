package String;

import java.util.*;

public class Find_all_possiable_palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        
        for (int i = 0; i < s.length(); i++) {
            String s2 = "" + s.charAt(i);
            
            for (int j = i + 1; j < s.length(); j++) { // Corrected loop condition
                s2 = s2 + s.charAt(j);
                
                if (isPalindrom(s2)) {
                    System.out.println(s2);
                }
            }
        }
	}

	public static boolean isPalindrom(String s2) {
		 String rev = "";
	        for (int i = s2.length() - 1; i >= 0; i--) { // Reverse the string
	            rev = rev + s2.charAt(i);
	        }
	        return rev.equals(s2);
	}

}
