package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaBillConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Select PizzaPrice Size: Small, Medium or Large");
		String pizzaSize = sc.next().toUpperCase();
		PizzaBillConstructor inputSize = new PizzaBillConstructor(pizzaSize);

		inputSize.addPepTopping();
		
		inputSize.addExtraCheese();
		
		System.out.println("Topping Cost: " + inputSize.toppingCost);
		System.out.println("Extra Cheese Cost: " + "$1.00");
		System.out.println("******************************************");
		inputSize.finalPrice();

		System.out.println("Your final bill amount is: $" + inputSize.basePrice);

		sc.close();
	}

}
