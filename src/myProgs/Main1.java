package myProgs;

class Account {

	int accountNo;
	String accountType;
	int accountBalance;

	public void setAccountDetails() {

		accountNo = 123456789;
		accountType = "Savings Account";
		accountBalance = 10000;

	}

	public void withdraw(int withdraw) {

		this.accountBalance = this.accountBalance - withdraw;

	}

	public void deposit(int deposit) {

		accountBalance = accountBalance + deposit;
	}

	public void dispAccountDetails() {

		System.out.println("Account number:" + accountNo);
		System.out.println("Account type:" + accountType);
		System.out.println("Account balance:" + accountBalance);
	}
}

public class Main1 {

	public static void main(String[] args) {

		Account mrc = new Account();
		mrc.setAccountDetails();

		mrc.withdraw(2000);
		mrc.deposit(4000);
		mrc.dispAccountDetails();

	}

}
