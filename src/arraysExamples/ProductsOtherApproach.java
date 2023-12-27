package arraysExamples;

import java.util.Scanner;

public class ProductsOtherApproach {

	// String[] products = new String[10];

	String[] products = { "Laptop", "Product", "Headphone", "Mouse", "Charger", "LaptopStands", "Keyboard",
			"HDMI Cable" };
	Scanner sc = new Scanner(System.in);

	void findProductExists() {

		System.out.println("Enter first product you want to buy:");
		String item1 = sc.next();
		System.out.println("Enter second product you want to buy:");
		String item2 = sc.next();

		
		int i = 0;
		// Iterate over the array
		for (; i < products.length; i++) {

			if (!((products[i].equalsIgnoreCase(item1) && (products[i].equalsIgnoreCase(item2))))) {
				System.out.println("No item found in the list");
				break;
			}

			else if (products[i].equalsIgnoreCase(item1)) {
				System.out.println("Found one of the items : " + item1 + " in the product list");
				break;
			}

			else if (products[i].equalsIgnoreCase(item2)) {
				System.out.println("Found one of the items : " + item2 + " in the product list");
				break;
			}

			else {
				System.out.println("Found both the item : " + item1 + " and " + item2 + " in the product list");
			}

		}

	}
}
