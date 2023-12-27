package loopAssignment;

import java.util.Scanner;

public class AmusementPark {

	Scanner sc = new Scanner(System.in);

	double minHeight;
	double maxHeight;
	double heightOfPerson;
	int maxCapacity;
	int personOnRide;

	void allowToRide() {
		while (personOnRide < maxCapacity) {
			System.out.println("Enter Person's height in cm: ");

			heightOfPerson = sc.nextDouble();

			if (!(heightOfPerson > minHeight && heightOfPerson < maxHeight)) {
				System.out.println("Not allowed");
				continue;
			}

			else {
				System.out.println("Allowed");
				personOnRide++;
			}

		}

		System.out.println("Ride Full, No More Person Allowed");

	}

}
