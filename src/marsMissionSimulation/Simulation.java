package marsMissionSimulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {

    public ArrayList<Item> loadItems(String filePath) throws IOException {
        File file = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            ArrayList<Item> items = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                items.add(new Item(parts[0], Integer.parseInt(parts[1])));
            }

            return items;
        }
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new R1();

        for (Item item : items) {
            if (!rocket.canCarry(item)) {
                rockets.add(rocket);
                rocket = new R1();
            }

            rocket.carry(item);
        }

        rockets.add(rocket);
        return rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new R2();

        for (Item item : items) {
            if (!rocket.canCarry(item)) {
                rockets.add(rocket);
                rocket = new R2();
            }

            rocket.carry(item);
        }

        rockets.add(rocket);
        return rockets;
    }

    public double runSimulation(ArrayList<Rocket> rockets) {
        double totalCost = 0.0;

        for (Rocket rocket : rockets) {
            boolean launchSuccess = rocket.launch();
            boolean landSuccess = rocket.land();

            while (!launchSuccess || !landSuccess) {
                totalCost += rocket.rocketCost;
                System.out.println("Rocket failed. Retrying...");
                rocket.reset();
                launchSuccess = rocket.launch();
                landSuccess = rocket.land();
            }

            totalCost += rocket.rocketCost;
        }

        return totalCost;
    }
}