package myPractise;

public class StaticDemo {

	int k;
	String name;
	static String company;
	
	static {
		
		System.out.println("i am in static");
	}
	public void display() {
		company="amazon";
		System.out.println("k:"+k+" "+"name:"+name+" "+"COmpany:"+company);
	}
	public StaticDemo() {
		System.out.println("i am in constructor");
	}
	static {
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		company="ericsson";
		company="firefly";
		company="apple";
		StaticDemo demo = new StaticDemo();
		demo.k=20;
		demo.name="ram";
		demo.display();
		StaticDemo demo1 = new StaticDemo();
		demo1.k=60;
		demo1.name="raakesh";
		demo1.display();
		

	}

}
