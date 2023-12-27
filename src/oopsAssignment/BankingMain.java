package oopsAssignment;

import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Name:");
//		String setName = sc.next();
//		System.out.println("Enter Username:");
//		String setUserName = sc.next();
//		System.out.println("Enter Password:");
//		String setPassword = sc.next();
//		System.out.println("Enter the amount of first deposit:");
//		double initialDeposit = sc.nextDouble();
//		System.out.println("Create your Pin:");
//		int setPin = sc.nextInt();
//
//		CustomerDetails calculate = new CustomerDetails(setName, setUserName, setPassword, initialDeposit, setPin);

		CustomerDetails customer = new CustomerDetails("Mr.Beans", "Bean420", "BestCartoon", 5000, 1234);

		ATM atm = new ATM();

		OnlineBanking onlineBanking = new OnlineBanking();

		System.out.println("Please select preferred mode - ATM or OnlineBanking: ");
		String mode = sc.next().toUpperCase();

		while ((!mode.equals("ATM")) && (!mode.equals("ONLINEBANKING"))) {

			System.out.println("Invalid Entry, Please Enter a valid mode - ATM or OnlineBanking: ");
			mode = sc.next().toUpperCase();
		}

		switch (mode) {

		case "ATM":
			System.out.println("Please enter your account number: ");
			String accountNumEntered = sc.next();
			System.out.println("Please enter your pin: ");
			int pinEntered = sc.nextInt();

			if (customer.validation(accountNumEntered, pinEntered) == true) {

				System.out.println("Please select Deposit or Withdrawl : ");
				String action = sc.next().toUpperCase();

				while ((!action.equals("DEPOSIT")) && (!action.equals("WITHDRAWL"))) {

					System.out.println("Invalid Entry, Please Enter a valid action - Deposit or Withdrawl : ");
					mode = sc.next().toUpperCase();
				}

				switch (action) {

				case "DEPOSIT":
					System.out.println("Please enter the deposit amount: ");
					double amountDeposited = sc.nextDouble();
					atm.deposit(amountDeposited, customer.getBalance(amountDeposited));
					break;

				default:
					System.out.println("Please enter the withdrawl amount: ");
					double amountWithdrawn = sc.nextDouble();
					atm.withdrawl(amountWithdrawn, customer.getBalance(amountWithdrawn));
					break;

				}
			}
			break;

		case "ONLINEBANKING":
			System.out.println("Please enter your username: ");
			String userNameEntered = sc.next();
			System.out.println("Please enter your password: ");
			String passwordEntered = sc.next();

			if (customer.validation(userNameEntered, passwordEntered) == true) {

				System.out.println("Please select Deposit or Withdrawl : ");
				String action = sc.next().toUpperCase();

				while ((!action.equals("DEPOSIT")) && (!action.equals("WITHDRAWL"))) {

					System.out.println("Invalid Entry, Please Enter a valid action - Deposit or Withdrawl : ");
					mode = sc.next().toUpperCase();
				}

				switch (action) {

				case "DEPOSIT":
					System.out.println("Please enter the deposit amount: ");
					double amountDeposited = sc.nextDouble();
					onlineBanking.deposit(amountDeposited, customer.getBalance(amountDeposited));
					break;

				default:
					System.out.println("Please enter the withdrawl amount: ");
					double amountWithdrawn = sc.nextDouble();
					onlineBanking.withdrawl(amountWithdrawn, customer.getBalance(amountWithdrawn));
					break;
				}

			}
		}
		sc.close();
	}
}