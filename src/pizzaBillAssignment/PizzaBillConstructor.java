package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaBillConstructor {

	String size;
	double basePrice;
	double toppingCost;

	Scanner sc = new Scanner(System.in);

	PizzaBillConstructor(String pizzaSize) {
		size = pizzaSize.toUpperCase();
		calculatePrice();
	}

	void calculatePrice() {

		switch (size) {
		case "SMALL":
			basePrice = 15.00;
			toppingCost = 2.00;
			break;
		case "MEDIUM":
			basePrice = 20.00;
			toppingCost = 3.00;
			break;
		case "LARGE":
			basePrice = 25.00;
			toppingCost = 3.00;
			break;
		default:
			System.out.println("Invalid Size, Input Again : Small, Medium or Large");
			size = sc.next().toUpperCase();
			calculatePrice();

		}
		
	}

	double addPepTopping() {

		System.out.println("Enter Y to add pepperoni topping");
		String input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			basePrice += toppingCost;
		} else {
			System.out.println("No Topping");
			basePrice += 0.00;
		}
		return basePrice;
	}

	double addExtraCheese() {
		System.out.println("Enter Y to add Extra Cheese: ");
		String input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			basePrice += 1.00;
		} else {
			System.out.println("No Extra Cheese");
			basePrice += 0.00;
		}
		return basePrice;
	}

	public double finalPrice() {
		return basePrice;
	}

}
