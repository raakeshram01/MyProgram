package myProgs;

public class PrimeSum {

	public static void main(String[] args) {

		int sum = 0;
		for (int start = 2; start <= 100; start++) {

			boolean isPrime = true;
			for (int i = 2; i <= start / i; i++) {
				if (start % i == 0) {
					isPrime = false;
					// System.out.println("is not a prime number");
					break;
				}
			}

			if (isPrime) {

				System.out.println(start + " " + "is a prime number");

				sum = sum + start;
			}

		}

		System.out.println(sum);

	}
}
