package myProgs;

public class Fibonacci {

	public static void main(String[] args) {
		int j = 0, k = 1;

		int i = 1;
		System.out.println("Fibonnaci series:");
		while (i <= 10) {
			System.out.print(j + " ");
			int sum = j + k;
			j = k;
			k = sum;
			i++;
		}
        
	}

}
