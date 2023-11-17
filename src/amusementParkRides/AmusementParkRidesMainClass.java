package amusementParkRides;

import java.util.Scanner;

public class AmusementParkRidesMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * AmusementParkRides allow = new AmusementParkRides(); allow.height = 90;
		 * 
		 * allow.checkheight();
		 */

		AmusementParkRides allow = new AmusementParkRides();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person's height in cm : ");
		allow.height = sc.nextInt();
		allow.checkheight();

		sc.close();

	}

}
