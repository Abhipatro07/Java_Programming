package Lambda_Expression;

public class SumTwoNumber {
	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		SumInter si = (a , b) -> a + b;
		
		System.out.println(si.sum(5, 6));
	}
}
