package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaBill {

//	Write a program to prepare the bill for a pizza shop.
//	Assume an order and work out the final bill.
//	Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
//	For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
//	Extra cheese for any size pizza: + $1
//	For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
//	“Your final bill is $24”

	int finalBill, basePrice, toppingCost, extraChesseCost;
	String size, addTopping, addExtraChesse, addPizza;

	int selectSize() {

		switch (size) {

		case "Small":

			basePrice = 15;
			break;
		case "Medium":

			basePrice = 20;
			break;
		case "Large":

			basePrice = 25;
			break;

		default:
			System.out.println("Invalid Input");
			System.exit(basePrice);
					}
		return basePrice;
	}

	int addPepperoniTopping() {

		switch (addTopping) {

		case "Y":

			if (size.equalsIgnoreCase("Small")) {

				toppingCost = 2;
			}

			else if (size.equalsIgnoreCase("Medium||Large")) {
				toppingCost = 3;
			}
			break;
		default:
			toppingCost = 0;
			break;
		}
		return toppingCost;
	}

	int addExtraChesse() {

		switch (addExtraChesse) {

		case "Y":

			extraChesseCost = 1;
			break;
		default:

			extraChesseCost = 0;
			break;
		}
		return extraChesseCost;
	}

//	void nextOrder() {
//
//		switch (addPizza) {
//
//		case "Y":
//
//			selectSize();
//			addPepperoniTopping();
//			addExtraChesse();
//			nextOrder();
//			break;
//		default:
//			break;
//		}
//
//	}
}