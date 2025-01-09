package Recursion;

public class Print_number_Using_recursion {

	public static void main(String[] args) {
		m1(5);
	}

	public static void m1(int n) {
		if(n > 0) {
			m1(n - 1);
			System.out.println(n);
		}
	}

}
