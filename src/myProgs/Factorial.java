package myProgs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a num:");
		int number = scanner.nextInt();
		int factorial = 1;
		int i = 1;
		while(i<=number) {
			factorial = factorial*number;
			
			number--;
		}
		System.out.println(factorial);
		
		

	}

}