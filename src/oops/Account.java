package oops;

public class Account {

	
	
	public void withdraw(int balance,int amount) throws WithdrawException {
		
		if(amount>balance) {
			
			throw new WithdrawException("Insufficient balance");
		}
		else {
			
			System.out.println("Withdraw Successfull");
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		
		Account obj = new Account();
		try {
		obj.withdraw(8000, 10000);
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
			
		}
		
	}

}
