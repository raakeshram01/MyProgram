package com.account.test;

import java.util.Scanner;

import com.account.Account;

public class AccountMain {

	public static void main(String[] args) {
		Account obj = new Account(1223456222, "Savings Account", 8000);
		Scanner scanner = new Scanner(System.in);
		int number;
		int amount1 = 0;
		do {
		System.out.println("1. Deposit ");
		System.out.println("2. Withdraw ");
		System.out.println("3. Display Balance ");
		System.out.println("4. Exit ");
		System.out.println("Enter the input number:");
		 number = scanner.nextInt();
		 
		 switch(number) {
			
		    case 1: System.out.println("enter the deposit amount:");
		                    amount1= scanner.nextInt();
		                    
		                    obj.deposit(amount1);
		                    
		                    break;
		                  
		    case 2 :System.out.println("Enter the amount to withdraw:");
		    
	                      int withDraw = scanner.nextInt();	
	                      
	                      obj.withdraw(withDraw);
	                       break;
		    case 3: obj.display();
		                   System.out.println(obj.getBalance());
		              
		    break;
		    case 4:System.out.println("Thank you for banking see you again");
		    System.exit(0);
		    break;
		 
		 
		 }
		 
		 
		 
		}while(number!=4);
		
		scanner.close();
		
		
		
	   
	    
//	System.out.println("enter amount is :"+amount);
		
		
		
		
		
		
	
		
	   
		
	   	
	} 
	
	   
}


