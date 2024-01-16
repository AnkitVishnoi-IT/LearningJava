package marsMissionSimulation;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();

		try {

			ArrayList<Item> items = simulation.loadItems("C:\\QA-10.23.23\\Assignment Folder\\phase-1.txt");

			ArrayList<Rocket> r1Fleet = simulation.loadU1(items);

			double totalBudgetR1 = simulation.runSimulation(r1Fleet);

			System.out.printf("Total cost for R1 fleet: $%,d million%n", (int) totalBudgetR1);

			ArrayList<Rocket> r2Fleet = simulation.loadU2(items);

			double totalBudgetR2 = simulation.runSimulation(r2Fleet);

			System.out.printf("Total cost for R2 fleet: $%,d million%n", (int) totalBudgetR2);

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