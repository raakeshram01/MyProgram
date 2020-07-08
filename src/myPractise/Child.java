package myPractise;

class Parent {

	int i;
	int j;
	int result;

}

public class Child extends Parent {

	
static int count = 0;

	Child() {
		count++;
		System.out.println("Number of instance/object references:" + count);

	}

	public int add() {
		i = 20;
		j = 40;
		result = i + j;
		return result;

	}

	public static void main(String[] args) {

	Child	 mrc = new Child();
		// System.out.println(mrc.add());
		Child mrc1 = new Child();
		Child mrc2 = new Child();
		Child mrc3 = new Child();
		Child mrc4 = new Child();
	}

}
