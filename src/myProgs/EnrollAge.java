package myProgs;

import java.util.Scanner;

public class EnrollAge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scanner.nextInt();

		if (age >= 18) {

			System.out.println("Person is Major can vote");

		} else if (age <= 0) {

			System.out.println("Invalid age");
		} else {

			System.out.println("person is minor can't vote");
		}

		scanner.close();

	}

}
