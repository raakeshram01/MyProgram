package oops;

interface Fruit1 {

	void cost(int Cost, int numberofItems, int profit);
}

class Apple1 implements Fruit1 {

	@Override
	public void cost(int Cost, int numberofItems, int profit) {
		int appleCost = Cost * numberofItems;

		int price = (numberofItems*profit) + appleCost;
		System.out.println("Price of the Apple:  " + price);
	}

	public void display() {
		System.out.println("iam raakesh");
	}

}

class Mango1 implements Fruit1 {

	@Override
	public void cost(int Cost, int numberofItems, int profit) {
		int MangoCost = Cost * numberofItems;

		int price = (numberofItems*profit) +  MangoCost;
		System.out.println("Price of the Mango:  " + price);

	}

}

public class FruitDemo1 {

	public static void main(String[] args) {

		Fruit1 fruit = new Apple1();
		fruit.cost(12, 1, 10);
		fruit = new Mango1();
		fruit.cost(20, 2, 13);
		
	}

}
