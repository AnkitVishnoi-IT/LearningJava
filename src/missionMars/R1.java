package missionMars;

public class R1 extends Rocket {

	public R1() {
		super.rocketCost = getRocketCost();
		super.rocketWeight = getRocketWeight();
		super.maxWeight = getMaxWeight();
		super.explosionPercent = getExplosionPercent();
		super.crashPercent = getCrashPercent();

	}

	public R1(R1 rocket) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRocketCost() {
		return 100; // in Million
	}

	@Override
	public int getRocketWeight() {
		return 10000; // in Kg
	}

	@Override
	public int getMaxWeight() {
		return 18000; // in Kg
	}

	@Override
	public double getExplosionPercent() {
		return 0.05; // per 100
	}

	@Override
	public double getCrashPercent() {
		return 0.01; // per 100
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
