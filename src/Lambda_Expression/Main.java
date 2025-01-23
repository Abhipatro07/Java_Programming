package Lambda_Expression;

public class Main {
	public static void main(String[] args) {
		System.out.println("The main method starts");
		
		
//		//By Creating the object of implementation class
//		MyInterImpl x = new MyInterImpl();
//		x.sayHello();
		
//		// Anonymous Class
//		MyInter i = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is first anonymous class");
//			}
//		};
//		i.sayHello();
		
		// Lambda Expression
		MyInter x = () -> {
			System.out.println("This is Lambda Expression");
		};
		
		x.sayHello();
	}
}
