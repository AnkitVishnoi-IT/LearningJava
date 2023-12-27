package PracticeLoop;

import java.util.Scanner;

public class RideWhileLoop {

//	  In wonderland, a ride can carry max 5 people. Write a code to help the
//	  operator from overfilling the ride i.e more than 5 people should not be
//	  allowed to get on the ride. Also ensure that the people getting on the ride
//	  meets the age criteria , Age of person should be greater than 21 but
//	  less than 55.

	Scanner sc = new Scanner(System.in);

	void capacity() {

		int age, peopleOnRide = 0;

		boolean isRideFull = false;

		while (!(isRideFull)) {

			System.out.println("Number on Pepole on the ride: " + peopleOnRide);
			System.out.println("");

			if (peopleOnRide < 5) {  //(Loop will only run till people on ride are less than 5)

				System.out.println("Enter your age : ");
				age = sc.nextInt();

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
				isRideFull = false;
			}

			else {
				System.out.println("****Ride Full****");
				isRideFull = true;
			}

		}

	}
}
