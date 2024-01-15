package missionMars;

public class Rocket implements SpaceShip {

	public int rocketCost;
	public int rocketWeight;
	public int maxWeight; // Max weight rocket can take (includes rocket Weight + item Weight) (in Kg)
	public int totalWeight; // Weight of rocketwith items (in Kg)
	public int cargoCarried; // Weight of total items in the rocket (in Kg)
	public int cargoLimit; // Weight Limit of total items that rocket can carry (in Kg)
	public double explosionPercent; // Chance of launch explosion
	public double crashPercent; // Chance of landing crash

	public int getRocketCost() {
		return rocketCost;
	}

	public void setRocketCost(int rocketCost) {
		this.rocketCost = rocketCost;
	}

	public int getRocketWeight() {
		return rocketWeight;
	}

	public void setRocketWeight(int rocketWeight) {
		this.rocketWeight = rocketWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getCargoCarried() {
		return cargoCarried;
	}

	public void setCargoCarried(int cargoCarried) {
		this.cargoCarried = cargoCarried;
	}

	public int getCargoLimit() {
		return cargoLimit;
	}

	public void setCargoLimit(int cargoLimit) {
		this.cargoLimit = cargoLimit;
	}

	public double getExplosionPercent() {
		return explosionPercent;
	}

	public void setExplosionPercent(double chanceOfLaunchExplosion) {
		this.explosionPercent = explosionPercent;
	}

	public double getCrashPercent() {
		return crashPercent;
	}

	public void setCrashPercent(double chanceOfLandingCrash) {
		this.crashPercent = crashPercent;
	}

	@Override
	public boolean launch() {

		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub

		return true;
	}

	@Override
	public boolean canCarry(Item item) {

		totalWeight = rocketWeight + item.getWeight(); // Total Weight that rocket can carry = rocketWeight + itemWeight
		boolean canCarry = totalWeight <= maxWeight;

		return canCarry;

	}

	@Override
	public void carry(Item item) {
		if (canCarry(item)) {
			totalWeight = rocketWeight + item.getWeight(); // Total Weight that a rocket carries = rocketWeight +
															// itemWeight
		}
	}

}
