package myProgs;

import java.util.Scanner;

public class Primer {

	
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not:");
		int number = scanner.nextInt();
		boolean isPrime = true;
		for(int i=2;i<=number/i;i++) {
			
			if(number%i==0)
			{
				isPrime=false;
				System.out.println("is not a prime number");
				
				break;
			}
			}
			if(isPrime) {
				System.out.println("is a prime number");
			}
			 
			scanner.close();	
		
	}
	}
		
		
	
		
		
		
		
		
	

