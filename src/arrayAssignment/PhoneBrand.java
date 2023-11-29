package arrayAssignment;

import java.util.Scanner;

public class PhoneBrand {

	Scanner sc = new Scanner(System.in);
	String[][] phones = { { "Samsung", "S20", "S21", "Flip3", "Fold3" },
			{ "Google", "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" },
			{ "Apple", "Iphone12", "IphoneSE", "Iphone15", "Iphone13" } };

	void showAvailableProduct() {

		System.out.println("Please select a brand : [Samsung, Apple, Google]");
		String phoneBrand = sc.next();
		boolean amongTheList = false;

		int i = 0;
		for (; i < 3; i++) {

			if (phones[i][0].equalsIgnoreCase(phoneBrand)) {
				amongTheList = true;

				break;
			}
		}
		if (amongTheList) {
			System.out.println("Selected Brand: " + phoneBrand);
			System.out.println("Available products are: " + phones[i][1] + ", " + phones[i][2] + ", "
					+ phones[i][3] + " and " + phones[i][4]);
			System.out.println("********************************************************************************");
			System.out.println("Enter a product name:");
			String productName = sc.next();
			boolean availability = false;

			int j = 0;
			for (; j < 4; j++) {

				if (phones[i][j].equalsIgnoreCase(productName)) {
					availability = true;

					break;
				}
			}
			if (availability) {
				System.out.println("Product selected is: " + productName);
								
			} else {
				System.out.println("Please select a product from the list");
			}

			
		} else {
			System.out.println("Please select a Brand from the list");
		}

	}

}