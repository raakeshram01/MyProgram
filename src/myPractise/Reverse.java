package myPractise;

public class Reverse {

	public static void main(String[] args) {
		String s="Ramakotiah";
		StringBuffer mrc = new StringBuffer(s);
		
		String reverse= mrc.reverse().toString(); 
	
		
		
		
		String mr ="rakesh,ravali,monika,sahithi";
		String me[]=mr.split(",");
		
		
		for(String val:me) {
			System.out.println(val);
		}
		
		System.out.println(me[1]);
		
		
		
		
//		String reverse="";
//		for(int i=s.length()-1;i>=0;i--) {
//			 reverse = reverse+s.charAt(i);
//			
//		}
//		
//		
//		
//		
		System.out.println(reverse);
		
		
		
	}

}
