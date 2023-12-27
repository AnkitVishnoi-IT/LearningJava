package loops;

import java.util.Scanner;

public class DoWhileExample {
	int noOfChoclates, houseno = 1;
	boolean isSnowingHeavily;
	boolean isMomCalling;

	Scanner sc = new Scanner(System.in);

	void trickAndTreating() {

		do {

			System.out.println("Choclates in hand : " + noOfChoclates);
			System.out.println("Go to House-" + houseno + " and say 'Trick or Treat' to get a choclate");
			// System.out.println("");
			System.out.println("Is it snowing");
			isSnowingHeavily = sc.nextBoolean();
			if (isSnowingHeavily) {
				System.out.println("Stop collecting Choclates and go home else mummy will become 'The Mummy'");
				break;
			}
			houseno++;
			noOfChoclates++;
			
		} while (noOfChoclates < 10);
	}
}
