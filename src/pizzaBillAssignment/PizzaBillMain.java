package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaBillMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int basic, addPep, addChesse;
		PizzaBill calculateFinalBill = new PizzaBill();

		System.out.println("Select PizzaPrice Size - Small, Medium or Large : ");
		calculateFinalBill.size = sc.next();
		calculateFinalBill.selectSize();
		basic = calculateFinalBill.basePrice;

		System.out.println("Enter Y to add Pepperoni Topping: ");
		calculateFinalBill.addTopping = sc.next();
		calculateFinalBill.addPepperoniTopping();
		addPep = calculateFinalBill.toppingCost;

		System.out.println("Enter Y to add Extra Chesse: ");
		calculateFinalBill.addExtraChesse = sc.next();
		calculateFinalBill.addExtraChesse();
		addChesse = calculateFinalBill.extraChesseCost;

//		System.out.println("Enter Y if you want to add another PizzaPrice : ");
//		calculateFinalBill.addPizza = sc.next();
//		calculateFinalBill.nextOrder();
		System.out.println("PizzaPrice Price: " + basic);
		System.out.println("Pepperoni Topping Cost: " + addPep);
		System.out.println("Extra Chesse Cost: " + addChesse);
		System.out.println("Finall Bill: " + (basic + addPep + addChesse));

	}

}
