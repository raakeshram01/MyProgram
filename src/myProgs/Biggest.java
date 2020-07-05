package myProgs;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value:");
		int num1 = scanner.nextInt();
		System.out.println("Enter second value:");
		int num2 = scanner.nextInt();
		System.out.println("Enter third value:");
		int num3 = scanner.nextInt();

		int Big = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 && num2 > num1) ? num2 : num3;
		System.out.println("Largest number of three given values is :" + Big);
		scanner.close();
	}

}
