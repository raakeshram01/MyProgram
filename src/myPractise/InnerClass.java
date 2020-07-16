package myPractise;

public class InnerClass {

	
	public void display() {
		
		System.out.println("I am outside the outer method");
		
		class InnerOut{
			
			@SuppressWarnings("unused")
			public void inner() {
				
				System.out.println("i am inside the outer method");
			}
			
		}
		InnerOut mrc = new InnerOut();
		mrc.inner();
		
	}
	
	
	
static	 String name="Raakesh";
   static	class Myself{
		
	   public void show() {
		   
		   System.out.println("Name of the :"+name);
		   
		   
		   class InnerMe{
			   
			  String name;
			  
			   
		   }
		   
		   
		   
		   
		   
		   
		   
	   }
		
		int a = 40;
		
		
		public static void main(String[] args) {
			System.out.println(name);
		}
		
	}
	
	
	
	
}

