package myPractise;



class Customer {

	int custId;
	String custName;
	String custAddress;

	public Customer(int custId, String custName, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;

	}

	public void display() {

		System.out.println("Customer id :" + custId);
		System.out.println("Customer name:" + custName);
		System.out.println("Customer address:" + custAddress);

	}
	
	
	
	
}
class Account2 {

	int acctId;
	String acctType;
	Customer customer;
	int acctBalance;

	public Account2(int acctId, String acctType, Customer customer,int acctBalance) {
		this.acctId = acctId;
		this.acctType = acctType;
		this.customer = customer;
		this.acctBalance = acctBalance;

	}

	public void display() {

		System.out.println("Account ID:" + acctId);
		System.out.println("Account Type:" + acctType);
		customer.display();
		System.out.println("Account balance:" + acctBalance);

	}

}

public  class   SampleAccount {

	public static void main(String[] args) {

		Customer mrc = new Customer(19123, "ram", "Hyderabad");
		//mrc.display();
		System.out.println("-----------------------------");
		Account2 mrc1 = new Account2(123, "checkings", mrc, 10000);
		mrc1.display();

	}

	
	}
