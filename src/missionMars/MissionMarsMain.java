package missionMars;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import marsMissionAssignment.Item;
import marsMissionAssignment.Rocket;
import marsMissionAssignment.Simulation;

public class MissionMarsMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String prototype;
		Simulation demo = new Simulation();
		String filename = "phase-1.txt";
		ArrayList<Item> items = demo.loadItems();
		ArrayList<Rocket> rockets = null;

		while (true) {
			System.out.println("Please select the Rocket Prototype :  R1 or R2:");
			prototype = sc.nextLine();

			if (prototype.equalsIgnoreCase("R1") || prototype.equalsIgnoreCase("R2")) {
				if (prototype.equalsIgnoreCase("R1")) {
					rockets = demo.loadU1(items);
				} else {
					rockets = demo.loadU2(items);
				}
				int totalCost = demo.runSimulation(rockets);
				System.out.println("Total cost for " + prototype.toUpperCase() + " fleet: $" + totalCost + " million");
				break;
			} else {
				System.out.println("Invalid input");
			}
		}

		sc.close();

	}

}
