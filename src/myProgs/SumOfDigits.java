package myProgs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = 1, sum = 0;

		while (i <= 5) {
			System.out.println("Enter a number");
			int n = scanner.nextInt();
			sum = sum + n;

			i++;
		}

		System.out.println("Sum of the digits:"+sum);
		scanner.close();

	}

}
