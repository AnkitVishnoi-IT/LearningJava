package cruiseAssignment;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		String inputUserName = null, inputPassword = null, inputName = null, inputPhNum = null, cruiseName,
				confirmSelection, addAdult;
		int totalNumOfAdults, totalKids, ageOfKid = 0, kidsAboveFive = 0, numOfDays;
		double priceOfAdults, priceOfKids;

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

				totalNumOfAdults = sc.nextInt();
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

					totalNumOfAdults = addAdult.equalsIgnoreCase("Add") ? totalNumOfAdults + 1 : totalNumOfAdults;
				}
			}

			if (ageOfKid <= 12 && ageOfKid >= 5) {
				kidsAboveFive++;
			}

		}

		cruise.setTotalAdutls(totalNumOfAdults);
		cruise.setTotalKidsAboveFive(kidsAboveFive);
		cruise.setSelectedCruise(cruiseName);
		priceOfAdults = cruise.getPriceForAdult();
		priceOfKids = cruise.getPriceForChildren();
		numOfDays = cruise.getNumOfDays();

		cruise.printBill(totalNumOfAdults, kidsAboveFive, priceOfAdults, priceOfKids, numOfDays);

		System.out.println("******************************************************");
		user.changeDetails();
		sc.close();
	}

}
