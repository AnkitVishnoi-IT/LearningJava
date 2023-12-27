package cruiseAssignment;

import java.util.Scanner;

public class CruiseDetails {

	Scanner sc = new Scanner(System.in);

	public int totalAdutls, totalKidsAboveFive, numOfDays;
	public double priceForAdult, priceForChildren, sumOfAdultsFood, sumOfKidsFood, sumOfAdultsFair, sumOfFoodAndFair,
			sumOfKidsFair, tax, grandTotal;
	public String selectedCruise, selectFood;

	public int getNumOfDays() {
		return 0;
	}

	public double getPriceForAdult() {
		return 0;

	}

	public double getPriceForChildren() {
		return 0;

	}

	public void setPriceForAdult() {
	}

	public void setPriceForChildren() {

	}

	public void setNumOfDays() {

	}

	public String getSelectedCruise() {
		return null;

	}

	public void setSelectedCruise(String selectedCruise) {
		this.selectedCruise = selectedCruise;
	}

	public int getTotalAdutls() {
		return totalAdutls;
	}

	public void setTotalAdutls(int totalAdutls) {
		this.totalAdutls = totalAdutls;
	}

	public int getTotalKidsAboveFive() {
		return totalKidsAboveFive;
	}

	public void setTotalKidsAboveFive(int totalKidsAboveFive) {
		this.totalKidsAboveFive = totalKidsAboveFive;
	}

	public void printBill(int totalAdults, int totalkidsAboveFive, double priceForAdult, double priceForChildren,
			double numOfDays) {
		sumOfAdultsFair = totalAdults * priceForAdult * numOfDays;
		sumOfKidsFair = totalkidsAboveFive * priceForChildren * numOfDays;
		sumOfAdultsFood = 0;
		sumOfKidsFood = 0;
		sumOfFoodAndFair = (sumOfAdultsFair) + (sumOfKidsFair) + (sumOfAdultsFood) + (sumOfKidsFood);
		tax = ((sumOfFoodAndFair * 15) / 100);
		grandTotal = sumOfFoodAndFair + tax;
		System.out.println("******************************************************");
		System.out.println("All our cruises have food services on board.\n"
				+ "Do you want to pre-book for dinner buffet meals at 20.99 per day for adults"
				+ " and 4.99 per day for kids?\n" + "Type Yes to select meal\n");
		selectFood = sc.next().toUpperCase();

		System.out.println("******************************************************");

		switch (selectFood) {
		case "YES":

			System.out.println("Your Package Includes:");

			System.out
					.println(selectedCruise + " Adults				@		" + totalAdults + "	:$" + sumOfAdultsFair);

			System.out.println(selectedCruise + " Children above 5			@		" + totalkidsAboveFive + "	:$"
					+ sumOfKidsFair);

			sumOfAdultsFood = totalAdults * numOfDays * 20.99;
			System.out.println("Buffet Special Price Adults			@		" + totalAdults + "	:$" + sumOfAdultsFood);

			sumOfKidsFood = totalkidsAboveFive * numOfDays * 4.99;
			System.out.println("Buffet Special Price Children above 5		@		" + totalkidsAboveFive + "	:$"
					+ sumOfKidsFood);

			System.out.println("Total Price								:$" + sumOfFoodAndFair);

			System.out.println("HST			@15%						:$" + tax);

			System.out.println("Final Price								:$" + grandTotal);

		default:

			System.out.println("Your Package includes:");

			System.out
					.println(selectedCruise + " Adults				@		" + totalAdults + "	:$" + sumOfAdultsFair);

			System.out.println(selectedCruise + " Children above 5			@		" + totalkidsAboveFive + "	:$"
					+ sumOfKidsFair);

			System.out.println("Total Price								:$" + sumOfFoodAndFair);

			System.out.println("HST			@15%						:$" + tax);

			System.out.println("Final Price								:$" + grandTotal);

		}

	}

}
