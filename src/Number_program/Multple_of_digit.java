package Programming_practice;
import java.util.*;

public class Multple_of_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int mul = 1;
		
		while(n != 0) {
			int temp = n % 10;
			mul = mul * temp;
			n = n / 10;
		}
		System.out.println(mul);
	}

}
