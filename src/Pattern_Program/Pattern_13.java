/*
 	1
 	1  2
 	1  2  3
 	1  2  3  4
 	1  2  3  4  5
 */
package Pattern_Program;

public class Pattern_13 {

	public static void main(String[] args) {
		int n = 5;
		int b = 1;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if (i >= j) {
					System.out.print(b + " ");
					b++;
				}
				
			}
			b = 1;
			System.out.println();
		}
	}

}
