package oopsAssignment;

public class BankOperations {

	public double withdrawl(double amountWithdrawn, double balance) {

		if (amountWithdrawn > balance) {
			System.out.println("Enter an amount leser than the available balance");
			return balance;
		} else {
			balance -= amountWithdrawn;
			System.out.println("New balance is: " + balance);
			return balance;
		}
	}

	public double deposit(double amountDeposited, double balance) {

		balance += amountDeposited;
		System.out.println("New balance is: " + balance);
		return balance;
	}

}
