package Practice;

public class Pattern_14 {
	public static void main(String[] args) {
		int n = 7;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j == 1 || i == j || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
