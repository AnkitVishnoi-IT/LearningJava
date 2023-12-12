package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaPrice {
	String size;
	double basePrice;
	double toppingCost;

	Scanner sc = new Scanner(System.in);

	void pizzaSize() {
		System.out.println("Select PizzaPrice Size: Small, Medium or Large");
		size = sc.next().toUpperCase();

	}

	double calculatePrice() {

		pizzaSize();

		switch (size) {
		case "SMALL":
			basePrice = 15.0;
			toppingCost = 2.0;
			break;
		case "MEDIUM":
			basePrice = 20.0;
			toppingCost = 3.0;
			break;
		case "LARGE":
			basePrice = 25.0;
			toppingCost = 3.0;
			break;
		default:
			System.out.println("Invalid Size, Input Again");
			pizzaSize();

		}
		return basePrice;
	}

	double addPepTopping() {

		System.out.println("Enter Y to add pepperoni topping");
		String input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			basePrice += toppingCost;
		} else {
			System.out.println("No Topping");
			basePrice += 0;
		}
		return basePrice;
	}

	double addExtraCheese() {
		System.out.println("Enter Y to add Extra Cheese: ");
		String input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			basePrice += 1.0;
		} else {
			System.out.println("No Extra Cheese");
			basePrice += 0;
		}
		return basePrice;
	}

}
