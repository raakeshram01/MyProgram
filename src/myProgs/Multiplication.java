package myProgs;

public class Multiplication {

	public static void main(String[] args) {

		System.out.println("Enter the table num to display multiplication:");

		 
		for (int table = 1; table <= 10; table++) {
			for (int i = 1; i <= 10; i++) {

				int	j = table * i;
				System.out.println("Multiplication table of" + table + "  " + table + " x " + i + " = " + j);

			}
		}

	}

}
