package PracticeLoop;

import java.util.Scanner;

public class RideDoWhileLoop {

	Scanner sc = new Scanner(System.in);

	void capacity() {

		int peopleOnRide = 0;

		// boolean isRideFull = false;

		do {

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (55 > age && age >= 21) {
				System.out.println("");
				System.out.println("You allowed to Ride");
				System.out.println("");
				peopleOnRide++;
			} else {
				System.out.println("");
				System.out.println("Sorry, you don't meet the age criteria. Let next person come");
				System.out.println("");
			}

			if (peopleOnRide == 5) {
				System.out.println("");
				System.out.println("****Ride Full****");
			}

		} while (peopleOnRide < 5);

	}

}
