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
		String filename = "phase-1.txt"; // Replace with the actual filename
		ArrayList<Item> items = demo.loadItems();
		ArrayList<Rocket> rockets = null;
		do {
			System.out.println("Please select which Rocket Prototype you want to simulate: R1 or R2");

			prototype = sc.nextLine();
			if (prototype.equalsIgnoreCase("R1")) {
				rockets = demo.loadU1(items);
			} else if (prototype.equalsIgnoreCase("R1")) {
				rockets = demo.loadU2(items);
			} else {
				System.out.println("Please enter a valid input");
			}
			int totalBudget = demo.runSimulation(rockets);
			System.out.println("Total budget required: $" + totalBudget + " million");

		} while (!((prototype.equalsIgnoreCase("R1")) || (prototype.equalsIgnoreCase("R2"))));

	}

}
