package Number_program;

import java.util.Scanner;

public class Add_Components_of_Every_Number {
	public static int power(int x , int y) {
		int mul = 1;
		
		for(int i = 1;i<=y;i++) {
			mul = mul * x;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int e = sc.nextInt();
		int sum = 0;
		int rem = 0;
		
		while(n != 0) {
			rem = n % 10;
			sum = sum + power(rem,e);
			n = n / 10;
		}
		System.out.println(sum);
	}

}
