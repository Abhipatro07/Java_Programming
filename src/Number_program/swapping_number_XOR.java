package Number_program;
import java.util.*;

public class swapping_number_XOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		System.out.println("Enter the value  a:");
		int a = sc.nextInt();
		System.out.println("Enter the value  b:");
		int b = sc.nextInt();
		
		System.out.println("Before swapping " + "\t" + "a: " + a  + "\t" + "b: " + b);
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		
		System.out.println("After  swapping " + "\t" + "a: " + a + "\t" + "b: " + b);
	}

}
