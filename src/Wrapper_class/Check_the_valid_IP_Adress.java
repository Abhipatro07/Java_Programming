package Wrapper_class;

import java.util.*;

public class Check_the_valid_IP_Adress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a IP Adress: ");
		String s = sc.next();
		String arr[] = s.split("[.]");
		
		if(arr.length == 4) {
			boolean flag = true;
			
			for(int i = 0;i<arr.length;i++) {
				int n = Integer.parseInt(arr[i]);
				if(n<0 || n>255) {
					flag = false;
					break;
				}
			}
			
			System.out.println(flag == true ? "Valid IP" : "Inavlid IP");
		}
		else {
			System.out.println("Invalid IP");
		}
	}

}
