package myPractise;

public interface Intzaam {

	int x =10;
	void mySelf();
	
	default void display() {
		System.out.println("jodha akbar");
	}
	void hello();
	
	static void show() {
		
		System.out.println("show me what you got ");
	}
	
	
	
}
