package oops;

abstract class Fruit {



	abstract public void cost(int Cost, int numberofItems, int profit);

}

class Apple extends Fruit {

	

	@Override
	public void cost(int Cost, int numberofItems, int profit) {
		int appleCost = Cost*numberofItems;
		
		int price = (numberofItems*profit) + appleCost;
		System.out.println("Price of the Apple:  " + price);
	}

	public void display() {
		System.out.println("iam raakesh");
	}
	
	
}

 class Mango extends Fruit {

	

	@Override
	public void cost(int Cost, int numberofItems, int profit) {
          int MangoCost = Cost*numberofItems;
		
		int price = (numberofItems*profit) + MangoCost;
		System.out.println("Price of the Mango:  " + price);
		
	}

}

public class FruitDemo {

	public static void main(String[] args) {
		
		Fruit obj = new Apple();
		obj.cost(20, 1, 5);
		
		Fruit obj1 = new Mango();
		obj1.cost(20, 2, 5);
	}

}
