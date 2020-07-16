package myPractise;

public interface Studio {
	
	void show();
	
	default void display() {
		
		System.out.println("I am in interface display");
	}
	
	static void hello() {
		
		System.out.println("i am in interface static hello");
	}

}
