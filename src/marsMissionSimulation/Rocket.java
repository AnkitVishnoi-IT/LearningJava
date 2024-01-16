package marsMissionSimulation;

import java.util.Random;

public class Rocket implements SpaceShip {

    protected int rocketCost;
    protected int rocketWeight;
    protected int maxWeight;
    protected double launchExplosionChance;
    protected double landingCrashChance;
    protected int currentWeight;

    public Rocket(int rocketCost, int rocketWeight, int maxWeight) {
        this.rocketCost = rocketCost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
        this.currentWeight = rocketWeight;
        updateProbabilities();
    }

    @Override
    public boolean launch() {
        return launchExplosionChance < Math.random();
    }

    @Override
    public boolean land() {
        return landingCrashChance < Math.random();
    }

    @Override
    public boolean canCarry(Item item) {
        return currentWeight + item.getItemWeight() <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getItemWeight();
        updateProbabilities();
    }

    public void updateProbabilities() {
        // Default implementation, to be overridden by subclasses
    }

    public void reset() {
        currentWeight = rocketWeight;
        updateProbabilities();
    }
}