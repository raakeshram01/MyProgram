package myProgs;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of π:");
		float pi = scanner.nextFloat();
		System.out.println("Enter the value of radius:");
		int r = scanner.nextInt();

		double area = pi * r * r;
		System.out.println("Area of the Cirlce:" + area);

		scanner.close();

	}

}
