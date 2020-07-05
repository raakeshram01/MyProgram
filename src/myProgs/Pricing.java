package myProgs;

import java.util.Scanner;

public class Pricing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item number:");
		int item = scanner.nextInt();
		System.out.println("Enter item name:");
		String itemName = scanner.next();
		System.out.println("Enter the rate of the item:");
		double rate = scanner.nextDouble();
		System.out.println("Enter the quantity of the item:");
		int quantity = scanner.nextInt();

		int price = (int) (rate * quantity);
		System.out.println("Price of the item:" + price);

		// calculating discount
		int discount = 0;

		if (price >= 1000 && price < 2000) {
			discount = (int) (0.10 * price);

		} else if (price >= 2000 && price < 3000) {
			discount = (int) (0.15 * price);
		} else if (price >= 3000 && price < 5000) {
			discount = (int) (0.20 * price);
		} else if (price >= 5000) {
			discount = (int) (0.25 * price);
		}

		int netPrice = price - discount;
		System.out.println("item number is :" + item);
		System.out.println("item name is :" + itemName);
		System.out.println("item price is:" + price);
		System.out.println("Discount of the item:" + discount);
		System.out.println("Netprice of the item:" + netPrice);
		scanner.close();
	}

}
