package marsMissionSimulation;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();

		try {
			// Step 2: Load Items for the Mission
			ArrayList<Item> items = simulation.loadItems("C:\\QA-10.23.23\\Assignment Folder\\phase-1.txt");

			// Step 3: Load a fleet of R1 rockets for the Mission
			ArrayList<Rocket> r1Fleet = simulation.loadU1(items);

			// Step 4: Run the simulation using the fleet of R1 rockets
			double totalBudgetR1 = simulation.runSimulation(r1Fleet);

			// Step 5: Display the total budget required for R1 fleet
			System.out.println("Total cost for R1 fleet: $" + totalBudgetR1);

			// Repeat the same for R2 rockets
			// Step 6: Load a fleet of R2 rockets for the Mission
			ArrayList<Rocket> r2Fleet = simulation.loadU2(items);

			// Step 7: Run the simulation using the fleet of R2 rockets
			double totalBudgetR2 = simulation.runSimulation(r2Fleet);

			// Step 8: Display the total budget required for R2 fleet
			System.out.println("Total cost for R2 fleet: $" + totalBudgetR2);

			// Additional Information
			// Step 9: Display total number of successful and unsuccessful launches and
			// lands
			displayLaunchLandStats(r1Fleet, "R1");
			displayLaunchLandStats(r2Fleet, "R2");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void displayLaunchLandStats(ArrayList<Rocket> fleet, String rocketType) {
		int successfulLaunches = 0;
		int unsuccessfulLaunches = 0;
		int successfulLands = 0;
		int unsuccessfulLands = 0;

		for (Rocket rocket : fleet) {
			if (rocket.launch()) {
				successfulLaunches++;
			} else {
				unsuccessfulLaunches++;
			}

			if (rocket.land()) {
				successfulLands++;
			} else {
				unsuccessfulLands++;
			}
		}

		System.out.println("Launch/Land Statistics for " + rocketType + " fleet:");
		System.out.println("Successful Launches: " + successfulLaunches);
		System.out.println("Unsuccessful Launches: " + unsuccessfulLaunches);
		System.out.println("Successful Lands: " + successfulLands);
		System.out.println("Unsuccessful Lands: " + unsuccessfulLands);
	}
}