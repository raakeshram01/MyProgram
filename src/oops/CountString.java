package oops;

public class CountString {


	
	
	
	
	
	
	public static void main(String[] args) {
		String s="Raake";
		String vowels="aeiou";
		char store=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==vowels.charAt(i)) {
				
				 store=s.charAt(i);
			
				i--;
				
			}
			System.out.println(store);
			
		}

	}

}
