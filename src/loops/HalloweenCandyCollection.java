package loops;

import java.util.Scanner;


public class HalloweenCandyCollection {

	int numOfChoclates, houseno; //int houseno = 1; for do while loop
	
	boolean isSnowingHeavily;

	Scanner sc = new Scanner(System.in);

	void trickAndTreating() {

		/*
		 * numOfChoclates++;
		 * 
		 * if (numOfChoclates<10) { System.out.println("Go to next house"); }
		 * 
		 * else { System.out.println("Stop");
		 * 
		 * }
		 */

		/*while (numOfChoclates < 10) {
			houseno++;
			numOfChoclates++;
			if (numOfChoclates != 10) {
				System.out.println("go to house-" + houseno);
				System.out.println("Total Choclates : " + numOfChoclates);
			}*/
		
		while (numOfChoclates < 10) {
			houseno++;
		System.out.println("Choclates in hand : " + numOfChoclates);
		System.out.println("Go to House-" + houseno + " and say 'Trick or Treat' to get a choclate");
		System.out.println("Is it snowing");
		isSnowingHeavily = sc.nextBoolean();
		if (isSnowingHeavily) {
			System.out.println("Stop collecting Choclates and go home else mummy will become 'The Mummy'");
		break;
				}
		
		numOfChoclates++;

			/*
			 * do { System.out.println("go to house# :" + houseno );
			 * System.out.println("Trick or Treat"); houseno++; numOfChoclates++;
			 * 
			 * System.out.println("Total Choclates : " + numOfChoclates); } while
			 * (numOfChoclates < 10);
			 */

		}

	}

}