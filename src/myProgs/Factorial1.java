package myProgs;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		int number = scanner.nextInt();
		int factorial = 1;
		int i, sum = 0;
		System.out.println("---------------------------");
		System.out.println("Number" + "     " + "Factorial");
		System.out.println("---------------------------");

		for (i = 1; i <= number; i++) {

			factorial = factorial * i;
			System.out.println(i + "          " + factorial);
			sum = sum + factorial;
		}

		System.out.println("---------------------------");
		System.out.println("Sum" + "        " + sum);
		System.out.println("---------------------------");
		scanner.close();
	}

}
