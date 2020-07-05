package myProgs;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int sum = 0;
		System.out.println("Enter 9 values:");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();

			}
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {

					System.out.println("Diagonal elements are :" + arr[i][j] + " ");
					sum = sum + arr[i][j];
				}

			}

		}

		System.out.println("sum of diagonal is :" + sum);
		scanner.close();
	}

}
