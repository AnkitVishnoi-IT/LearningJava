package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaBillSimple {

	String size, addPepTopping, addExtraCheese;
	double basePrice, toppingCost, addOnPrice, finalPrice;

	Scanner sc = new Scanner(System.in);

	void calculatePrice() {

		switch (size) {
		case "SMALL":
			basePrice = 15.00;
			toppingCost = 2.00;
			System.out.println("Base price: " + basePrice);
			break;
		case "MEDIUM":
			basePrice = 20.00;
			toppingCost = 3.00;
			System.out.println("Base price: " + basePrice);
			break;
		case "LARGE":
			basePrice = 25.00;
			toppingCost = 3.00;
			System.out.println("Base price: " + basePrice);
			break;
		default:
			System.out.println("Invalid Size, Input Again");
			System.out.println("Select PizzaPrice Size: Small, Medium or Large");
			size = sc.next().toUpperCase();
			calculatePrice();

		}

	}

	void addPepTopping() {

		if (addPepTopping.equalsIgnoreCase("Y")) {
			addOnPrice = basePrice + toppingCost;
			System.out.println("Topping Cost: " + toppingCost);
		} else {
			System.out.println("No Topping Selected");
			addOnPrice = basePrice;
		}
	}

	void addExtraCheese() {
		finalPrice = addOnPrice;
		if (addExtraCheese.equalsIgnoreCase("Y")) {
			finalPrice += 1.00;
			System.out.println("Extra Cheese Cost: $" + 1.00);
		} else {
			System.out.println("No Extra Cheese Selected");

		}

	}

}
