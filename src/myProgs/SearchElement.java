package myProgs;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter element to search:");
		boolean found = false;
		int search = scanner.nextInt();
		int n[] = { 12, 82, 91, 33, 52 };
		for (int i = 0; i < n.length; i++) {

			if (n[i] == search) {

				System.out.println("element found");
				found = true;
				break;
			}

		}
		if (found == false)
			System.out.println("element not found");

		scanner.close();
	}
}
