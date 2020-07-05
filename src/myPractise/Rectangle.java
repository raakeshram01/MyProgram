package myPractise;

public class Rectangle {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {

		int area = length * breadth;
		System.out.println("Area of the rectangle:" + area);
	}

	public static void main(String[] args) {

		Rectangle mrc = new Rectangle(14, 4);
		mrc.area();

	}

}
