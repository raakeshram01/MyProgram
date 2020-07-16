package myPractise;

import myProgs.AccountTest;
import oops.FruitDemo;

class Outer { 
	   void outerMethod() { 
	      int x = 98; 
	      System.out.println("inside outerMethod"); 
	      class Inner { 
	         void innerMethod() { 
	            System.out.println("x= "+x); 
	         } 
	      } 
	      Inner y = new Inner(); 
	      y.innerMethod(); 
	   } 
	   
	
	   
	   
	   
	   
	   
	} 
	public class MethodVariable { 
		
		
		  static Studio  mr = new Studio() {

				@Override
				public void show() {
					System.out.println("i am show");
					
				}
				   
				   
				   
			   };
	   public static void main(String[] args) { 
	      Outer x=new Outer(); 
	      x.outerMethod(); 
	     
		mr.show();
		
		AccountTest mrc1 = new AccountTest();
		FruitDemo mrc2 = new FruitDemo();
		
	   } 
	}