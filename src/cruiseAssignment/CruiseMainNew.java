package cruiseAssignment;

import java.util.Scanner;

public class CruiseMainNew {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputUserName = null, inputPassword = null, inputName = null, inputPhNum = null, cruiseName,
				confirmSelection;
		int numOfDays;
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

		cruise.setSelectedCruise();
		cruiseName = cruise.getSelectedCruise();

		cruise = cruiseName.equalsIgnoreCase("Scenic Cruise") ? new ScenicCruise()
				: cruiseName.equalsIgnoreCase("Sunset Cruise") ? new SunsetCruise()
						: cruiseName.equalsIgnoreCase("Discovery Cruise") ? new DiscoveryCruise()
								: cruiseName.equalsIgnoreCase("Mystery Cruise") ? new MysteryCruise() : null;
		cruise.getConfirmation(cruiseName);

		user.setTotalNumOfAdults();
		user.setKidsAboveFive();

		cruise.setTotalAdutls(user.getTotalNumOfAdults());
		cruise.setTotalKidsAboveFive(user.getKidsAboveFive());
		priceOfAdults = cruise.getPriceForAdult();
		priceOfKids = cruise.getPriceForChildren();
		numOfDays = cruise.getNumOfDays();

		cruise.printBill(user.getTotalNumOfAdults(), user.getKidsAboveFive(), priceOfAdults, priceOfKids, numOfDays);

		System.out.println("******************************************************");
		user.changeDetails();
		sc.close();
	}

}
