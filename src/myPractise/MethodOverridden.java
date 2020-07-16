package myPractise;

class Parent1{
	
	public void show() {
		
		System.out.println("i am in parent");
	}
}


public class MethodOverridden extends Parent1 {


	public void show() {
		
		System.out.println("i am in child ");
	}
	
	
	public static void main(String[] args) {

		MethodOverridden mrc = new MethodOverridden();
		mrc.show();
		
		
		
		
		
		
		
		
		/*
		 * String message = "Hello World!"; String newMessage = message.substring(6, 12)
		 * + message.substring(12, 6);
		 * 
		 * System.out.println(newMessage);
		 */

	}

}
