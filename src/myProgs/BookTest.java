package myProgs;

class Book {

	int bno;
	String bname;
	double price;

	Book() {
	}

	Book(int bno, String bname, double price) {

		this.bno = bno;
		this.bname = bname;
		this.price = price;

	}

	public void display() {

		System.out.println("Book num:" + bno);
		System.out.println("Book Name:" + bname);
		System.out.println("Book Price:" + price + "$");

	}

}

class SpecialEditionBook extends Book {

	double discount;

	public SpecialEditionBook(int bno, String bname, double price, double discount) {

		super(bno, bname, price);
		this.discount = discount;
	}

	public void display() {

		super.display();
		System.out.println("Discount:" + discount + "%");

	}

}

public class BookTest {

	public static void main(String[] args) {

		SpecialEditionBook book = new SpecialEditionBook(102, "The power of now", 200.60, 15);
		book.display();

	}

}
