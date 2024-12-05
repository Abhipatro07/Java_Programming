/*
 	*
 	*
 	*
 	*
 	* * * * *
 */
package Pattern_Program;

public class Pattern_4 {

	public static void main(String[] args) {
		int n = 5;
		
		 for (int i = 1; i <= n; i++) {
	            if (i == n) {
	                // Print stars in the last row
	                for (int j = 1; j <= n; j++) {
	                    System.out.print("* ");
	                }
	            } else {
	                // Print one star for all other rows
	                System.out.println("*");
	            }
	        }
	}

}
