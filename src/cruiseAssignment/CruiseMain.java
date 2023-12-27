package cruiseAssignment;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		String inputUserName = null, inputPassword = null, inputName = null, inputPhNum = null, cruiseName,
				confirmSelection, addAdult, selectFood, newInput;
		int totalAdults, totalKids, ageOfKid = 0, kidsAboveFive = 0, inputSelection;

		do {
			System.out.println("Welcome to Cruise Booking");
			System.out.println("Enter 'Signup' to book a cruise");
			confirmSelection = sc.nextLine();

			if (confirmSelection.equalsIgnoreCase("Signup")) {
				System.out.println("Enter your email address : \n");
				inputUserName = sc.nextLine();
				System.out.println("Enter the password that you want to use : \n");
				inputPassword = sc.nextLine();
				System.out.println("Enter your Full Name : \n");
				inputName = sc.nextLine();
				System.out.println("Enter your phone number : \n");
				inputPhNum = sc.nextLine();
				System.out.println("******************************************************");
				System.out.println("Thank you for registering!");
				System.out.println("******************************************************");
			} else {
				System.out.println("Invalid selection, try again");
			}

		} while (!(confirmSelection.equalsIgnoreCase("Signup")));
		UserDetails user = new UserDetails(inputName, inputPassword, inputUserName, inputPhNum);
		CruiseDetails cruise = new CruiseDetails();

		System.out.println("You are Logged in");
		System.out.println("******************************************************\n");
		do {
			System.out.println(
					"We offer 4 different pakages as displayed below. Please enter the cruise that you want to select.");
			System.out.println("Scenic Cruise");
			System.out.println("Sunset Cruise");
			System.out.println("Discovery Cruise");
			System.out.println("Mystery Cruise\n");
			cruiseName = sc.nextLine();
			if (cruiseName.equalsIgnoreCase("Scenic Cruise") || cruiseName.equalsIgnoreCase("Sunset Cruise")
					|| cruiseName.equalsIgnoreCase("Discovery Cruise")
					|| cruiseName.equalsIgnoreCase("Mystery Cruise")) {

				cruise = cruiseName.equalsIgnoreCase("Scenic Cruise") ? new ScenicCruise()
						: cruiseName.equalsIgnoreCase("Sunset Cruise") ? new SunsetCruise()
								: cruiseName.equalsIgnoreCase("Discovery Cruise") ? new DiscoveryCruise()
										: cruiseName.equalsIgnoreCase("Mystery Cruise") ? new MysteryCruise() : null;

				System.out.println("******************************************************");
				System.out.println("The cruise that you have selected is " + cruiseName + " which is a "
						+ cruise.getNumOfDays() + " day cruise");
				System.out.println("Price for Adults (greater than 12)	:" + cruise.getPriceForAdult() + " per day");
				System.out.println("Price for kids above 5			:" + cruise.getPriceForChildren() + " per day");
				System.out.println(
						"Please press Y if you want to continue with the selection or press another alphabet to select another.\n");
			}

			else {
				System.out.println(
						"Invalid Entry. Please press Y if you want to STOP else press another alphabet to continue.\n");
			}
			confirmSelection = sc.nextLine();
			System.out.println("******************************************************");

		}

		while (!(confirmSelection.equalsIgnoreCase("Y")));

		while (true) {
			try {
				System.out.println("Enter the Number of Adults\n");

				totalAdults = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Invalid Input, Please Enter valid Number of Adults\n");
				sc.nextLine();
				continue;
			}
		}

		while (true) {
			try {
				System.out.println("Enter the Number of Children\n");

				totalKids = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Invalid Input, Please Enter valid Number of Children\n");
				sc.nextLine();
				continue;
			}
		}

		for (int i = 0; i <= totalKids; i++) {

			if (i > 0) {
				while (true) {
					try {
						System.out.println("Enter the age of child" + i + "\n");
						ageOfKid = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Invalid Input, Age can only be Numbers");
						sc.nextLine();
						continue;
					}
				}
				if (ageOfKid > 12) {
					System.out.println("Traveller is above kid's age limit and should be considered as Adult"
							+ "Type 'Add' to increase the number of adults.\n");
					addAdult = sc.nextLine();

					totalAdults = addAdult.equalsIgnoreCase("Add") ? totalAdults + 1 : totalAdults;
				}
			}

			if (ageOfKid <= 12 && ageOfKid >= 5) {
				kidsAboveFive++;
			}

		}

		double sumOfAdultsFair = totalAdults * cruise.getPriceForAdult() * cruise.getNumOfDays();
		double sumOfKidsFair = kidsAboveFive * cruise.getPriceForChildren() * cruise.getNumOfDays();
		double sumOfAdultsFood = 0;
		double sumOfKidsFood = 0;
		double sumOfFoodAndFair = (sumOfAdultsFair) + (sumOfKidsFair) + (sumOfAdultsFood) + (sumOfKidsFood);
		double tax = ((sumOfFoodAndFair * 15) / 100);
		double grandTotal = sumOfFoodAndFair + tax;
		System.out.println("******************************************************");
		System.out.println("All our cruises have food services on board.\n"
				+ "Do you want to pre-book for dinner buffet meals at 20.99 per day for adults"
				+ " and 4.99 per day for kids?\n" + "Type Yes to select meal\n");
		selectFood = sc.next().toUpperCase();

		System.out.println("******************************************************");

		switch (selectFood) {
		case "YES":

			System.out.println("Your Package Includes:");

			System.out.println(cruiseName + " Adults				@		" + totalAdults + "	:$" + sumOfAdultsFair);

			System.out.println(
					cruiseName + " Children above 5			@		" + kidsAboveFive + "	:$" + sumOfKidsFair);

			sumOfAdultsFood = totalAdults * cruise.getNumOfDays() * 20.99;
			System.out.println("Buffet Special Price Adults			@		" + totalAdults + "	:$" + sumOfAdultsFood);

			sumOfKidsFood = kidsAboveFive * cruise.getNumOfDays() * 4.99;
			System.out.println(
					"Buffet Special Price Children above 5		@		" + kidsAboveFive + "	:$" + sumOfKidsFood);

			System.out.println("Total Price								:$" + sumOfFoodAndFair);

			System.out.println("HST			@15%						:$" + tax);

			System.out.println("Final Price								:$" + grandTotal);

		default:

			System.out.println("Your Package includes:");

			System.out.println(cruiseName + " Adults				@		" + totalAdults + "	:$" + sumOfAdultsFair);

			System.out.println(
					cruiseName + " Children above 5			@		" + kidsAboveFive + "	:$" + sumOfKidsFair);

			System.out.println("Total Price								:$" + sumOfFoodAndFair);

			System.out.println("HST			@15%						:$" + tax);

			System.out.println("Final Price								:$" + grandTotal);

			System.out.println("******************************************************");
			System.out.println(
					"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.\n");
			confirmSelection = sc.next();
			if (confirmSelection.equalsIgnoreCase("Y")) {
				do {
					System.out.println("******************************************************");
					System.out.println("Please enter the information you want to change.\n");
					System.out.println("Please Enter '1' to change Password");
					System.out.println("Please Enter '2' to change Phone number");
					System.out.println("Please Enter '3' to change Email");
					inputSelection = sc.nextInt();
					if (inputSelection == 1 || inputSelection == 2 || inputSelection == 3) {

						for (int attempts = 0; attempts < 3; attempts++) {

							System.out.println("Enter your existing password");
							newInput = sc.next();

							if (newInput.equalsIgnoreCase(user.getPassword())) {

								switch (inputSelection) {

								case 1:
									System.out.println("Enter your new password\n");
									confirmSelection = sc.next();
									user.setPassword(confirmSelection);
									System.out.println("Your password has been changed!");
									System.out.println("Thank you for using the service!");
									break;
								case 2:
									System.out.println("Enter your new phone number\n");
									confirmSelection = sc.next();
									user.setPhNum(confirmSelection);
									System.out.println("Your phone number has been changed!");
									System.out.println("Thank you for using the service!");
									break;
								case 3:
									System.out.println("Enter your new email\n");
									confirmSelection = sc.next();
									user.setUserName(confirmSelection);
									System.out.println("Your email has been changed!");
									System.out.println("Thank you for using the service!");
									break;
								default:
									System.out.println("Incorrect Field Selected");

								}

								break;
							}

							else if (attempts < 2) {
								System.out.println("Incorrect password.Try again");

							} else {
								System.out.println("Incorrect password multiple times - Exiting System");
								System.exit(0);
							}

						}

					} else {
						System.out.println("Incorrect Input");
					}
				}

				while (!(inputSelection == 1 || inputSelection == 2 || inputSelection == 3));

			} else {
				System.out.println("Exiting System");

			}

			sc.close();
		}
	}
}
