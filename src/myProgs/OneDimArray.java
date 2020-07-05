package myProgs;

public class OneDimArray {

	public static void main(String[] args) {

		int n[] = { 21,87,96,34,55,2,108 };

		int Big = Integer.MIN_VALUE;
		int secondBig = Integer.MIN_VALUE;

		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;

		for (int i = 0; i < n.length; i++) {
			if (n[i] > Big) {
				secondBig = Big;
				Big = n[i];
			}
			if (n[i] < Big && n[i] > secondBig) {
				secondBig = n[i];
			}
			if(n[i]<small) {
				secondSmall= small;
				small=n[i];
			}
			
			
			if(n[i]>small&&n[i]<secondSmall) {
				
				secondSmall=n[i];
			}
			
			
			
				
			}
		
		System.out.println("Big element is :" + Big);
		System.out.println("Small element is :" + small);
		System.out.println("Second Big element is :" + secondBig);
        System.out.println("Second small element is :"+secondSmall);   
	}

}
