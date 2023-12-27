package arraysExamples;

import java.util.Scanner;

public class Products {

	// String[] products = new String[10];

	String[] products = { "Laptop", "Product", "Headphone", "Mouse", "Charger", "LaptopStands", "Keyboard",
			"HDMI Cable" };
	Scanner sc = new Scanner(System.in);

	void findProductExists() {

		System.out.println("Enter first product you want to buy:");
		String item1 = sc.next();
		System.out.println("Enter second product you want to buy:");
		String item2 = sc.next();

		boolean item1Found = false, item2Found = false;
		// Iterate over the array
		for (int i = 0; i < products.length; i++) {

			if (products[i].equalsIgnoreCase(item1) && (products[i].equalsIgnoreCase(item2))) {
				item1Found = true;
				item2Found = true;
			}

			else if (products[i].equalsIgnoreCase(item1)) {
				item1Found = true;
			}

			else if (products[i].equalsIgnoreCase(item2)) {
				item2Found = true;
				}

		}

		if (item1Found && item2Found) {
			System.out.println("Found both the item : " + item1 + " and " + item2 + " in the product list");
		}

		else if (item1Found) {
			System.out.println("Found one of the items : " + item1 + " in the product list");
		}

		else if (item2Found) {
			System.out.println("Found one of the items : " + item2 + " in the product list");
		}

		else {
			System.out.println("No item found in the list");
		}

	}

}
