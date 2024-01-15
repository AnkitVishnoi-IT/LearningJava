package missionMars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import marsMissionAssignment.Item;
import marsMissionAssignment.R1;
import marsMissionAssignment.R2;
import marsMissionAssignment.Rocket;

public class Simulation {

	Scanner sc = new Scanner(System.in);

	public ArrayList<Item> loadItems() throws IOException {

		File f = new File("C:\\QA-10.23.23\\Assignment Folder\\phase-1.txt");

		FileReader fr = new FileReader(f);

		BufferedReader rd = new BufferedReader(fr);

		String x;
		ArrayList<String> input = new ArrayList<String>();
		ArrayList<Item> item = new ArrayList<>();

		while ((x = rd.readLine()) != null) {
			input.add(x);

		}
		int j = input.size();
		String[] string = new String[j];

		for (int i = 0; i < input.size(); i++) {
			String a = input.get(i);
			string = (a.split("="));
//		System.out.println(Arrays.toString(string));
			item.add(new Item(string[0], Integer.parseInt(string[1])));
		}

		return item;

	}

	public static ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R1 rocket = new R1();
		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R1();
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	public static ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R2 rocket = new R2();
		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R2();
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	public static int runSimulation(ArrayList<Rocket> rockets) {
		int totalCost = 0;
		for (Rocket rocket : rockets) {
			do {
				totalCost += 100;
			} while (rocket.launch() && rocket.land());
		}
		return totalCost;

	}

}
