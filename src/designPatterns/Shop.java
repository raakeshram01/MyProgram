package designPatterns;

public class Shop {

	public static void main(String[] args) {

		Phone mrc = new PhoneBuilder().setOs("android").setProcessor("quad").setRam(8).getPhone();
		System.out.println(mrc);
		
		
	}
}
