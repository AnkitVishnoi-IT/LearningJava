package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaBillSimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzaBillSimple inputSize = new PizzaBillSimple();

		Scanner sc = new Scanner(System.in);

		System.out.println("Select PizzaPrice Size: Small, Medium or Large");
		inputSize.size = sc.next().toUpperCase();
		inputSize.calculatePrice();
		
		System.out.println("Enter Y to add Peproni Topping: ");
		inputSize.addPepTopping = sc.next().toUpperCase();
		inputSize.addPepTopping();

		System.out.println("Enter Y to add Extra Cheese: ");
		inputSize.addExtraCheese = sc.next().toUpperCase();
		inputSize.addExtraCheese();

		
		System.out.println("******************************************");
		System.out.println("Your final bill amount is: $" + inputSize.finalPrice);

		sc.close();

	}

}
