package accessModifiers;

//Code for a shop that gives $5 cash-back on every purchase of $100 to its members
public class CashBack {

	private String loyaltyNum;
	private double cashBack = 0.00;

	public CashBack(String loyaltyNum, double cashback) {
		this.loyaltyNum = loyaltyNum;
			}

	
	public double getCashBack(String membershipNum, double purchaseAmount) {
		if (membershipNum.equals(loyaltyNum)) {
			cashBack = Math.floor((purchaseAmount / 100) * 5);

			} else {
				System.out.println("Invalid LoyalyNumber");
			
		}
		return cashBack;
	}
}