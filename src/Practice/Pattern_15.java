package Practice;

public class Pattern_15 {
	public static void main(String[] args) {
		int n = 7;
		int st = 1 , sp = n/2;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k = 1;k<=st;k++) {
				System.out.print("* ");
			}
			
			if(i <= n/2) {
				st = st + 2;
				sp--;
			}
			else {
				sp++;
				st = st - 2;
			}
			
			System.out.println();
		}
	}
}
