package myProgs;

public class SumEvenOdd {

	public static void main(String[] args) {

		int i = 1;

		int sumEven = 0;
		int sumOdd = 0;
		while (i <= 100) {

			if (i % 2 == 0) {

				sumEven = sumEven + i;

			}

			if (i % 2 != 0) {

				sumOdd = sumOdd + i;
			}

			i++;

		}

		System.out.println("Sum of first 100 even numbers:"+sumEven);
		System.out.println("Sum of first 100 odd numbers:"+sumOdd);

	}

}
