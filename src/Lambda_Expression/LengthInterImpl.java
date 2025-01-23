package Lambda_Expression;

public class LengthInterImpl {
	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		LengthInter li = (s) -> s.length();
		
		System.out.println(li.getLength("Abhi"));
	}
}
