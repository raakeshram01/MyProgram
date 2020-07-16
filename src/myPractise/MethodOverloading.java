package myPractise;

public class MethodOverloading {

	public static int multiply(int a,int b) {
		
		
		return a*b;
	}
	public static double multiply(double a, double b) {

		
		return a*b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(multiply(4,5));
		System.out.println(MethodOverloading.multiply(5.5, 6.5));
	}

}
