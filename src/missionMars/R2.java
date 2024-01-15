package missionMars;

public class R2 extends Rocket {

	public R2() {
		super.rocketCost = getRocketCost();
		super.rocketWeight = getRocketWeight();
		super.maxWeight = getMaxWeight();
		super.explosionPercent = getExplosionPercent();
		super.crashPercent = getCrashPercent();

	}

	@Override
	public int getRocketCost() {
		return 120; // in Million
	}

	@Override
	public int getRocketWeight() {
		return 18000; // in Kg
	}

	@Override
	public int getMaxWeight() {
		return 29000; // in Kg
	}

	@Override
	public double getExplosionPercent() {
		return 0.04; // per 100
	}

	@Override
	public double getCrashPercent() {
		return 0.08; // per 100
	}

	@Override
	public boolean launch() {

		if (getExplosionPercent() < Math.random()) {

			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean land() {

		if (getCrashPercent() < Math.random()) {

			return true;
		} else {
			return false;
		}
	}
}
