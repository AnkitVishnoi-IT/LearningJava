package oopsAssignment;

public class CustomerDetails {

	private String accountNum, customerName, userName, password;
	private double initialDeposit, balance=initialDeposit;
	private int pin;

	public CustomerDetails(String customerName, String userName, String password, double initialDeposit, int pin) {
		super();
		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this.pin = pin;
	}

	public String getPassword() {
		return password;
	}

	public int getPin() {
		return pin;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	
	public double getBalance(double balance) {
		return balance;
	}
	
public double setBalance(double amountDeposited, double amountWithdrawn) {
		
	balance = initialDeposit + amountDeposited -amountWithdrawn;
		
		return balance;
	}

	public String getAccountNum() {
		accountNum = "12345678";
		return accountNum;
	}

	public boolean validation(String accountNumEntered, int pinEntered) {

		if (accountNumEntered.equals(getAccountNum()) && pinEntered == this.pin) {
			return true;
		} else {
			System.out.println("Invalid Account Number or Pin");
			return false;
		}
	}

	public boolean validation(String userNameEntered, String passwordEntered) {

		if (userNameEntered.equals(userName) && passwordEntered.equals(this.password)) {
			return true;
		} else {
			System.out.println("Invalid Username or Password");
			return false;
		}
	}

}
