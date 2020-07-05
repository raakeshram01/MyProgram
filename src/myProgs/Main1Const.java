package myProgs;

class Account1 {

	int accountNo;
	String accountType;
	int accountBalance;

	public Account1(int accountNo, String accountType, int accountBalance) {

		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;

	}

	public void withdraw(int withdraw) {

		accountBalance = accountBalance - withdraw;

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

public class Main1Const {

	public static void main(String[] args) {

		Account1 mrc = new Account1(987654321, "checkings account", 25000);
		mrc.deposit(3000);
		mrc.withdraw(2000);

		mrc.dispAccountDetails();

	}

}
