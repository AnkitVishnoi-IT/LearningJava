package arrayAssignment;

import java.util.Scanner;

public class PhoneBrand {

	Scanner sc = new Scanner(System.in);
	String[][] phones = { { "Samsung", "S20", "S21", "Flip3", "Fold3" },
			{ "Google", "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" },
			{ "Apple", "Iphone12", "IphoneSE", "Iphone15", "Iphone13" } };

	void showAvailableProduct() {

		System.out.println("Please Enter a phone brand from the below List:");
		System.out.println("Samsung, Google, Apple");
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
			System.out.println("product selected is: " + phoneBrand);
			System.out.println("Available products in this brand: " + phones[i][1] + ", " + phones[i][2] + ", "
					+ phones[i][3] + " and " + phones[i][4]);
		} else {
			System.out.println("Please select a product from the list");
		}

	}

}