package loopAssignment;

import java.util.Scanner;

public class AmusementParkMaxMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AmusementParkMaxLimit checkheight = new AmusementParkMaxLimit();
		for (int i = checkheight.personOnRide; checkheight.personOnRide < 10; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Number of person on ride: " + checkheight.personOnRide);
			System.out.println("Enter person's height in cm : ");
			Thread.sleep(2000);
			checkheight.height = sc.nextDouble();
			checkheight.allowToRide();
		}
		System.out.println("Number of person on ride: " + checkheight.personOnRide);
		System.out.println("No more person allowed");
	}
}
