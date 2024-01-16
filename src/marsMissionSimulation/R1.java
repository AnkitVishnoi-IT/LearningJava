package marsMissionSimulation;

public class R1 extends Rocket {

	public R1() {
		super(100, 10000, 18000);
		updateProbabilities();
	}

	@Override
	public void updateProbabilities() {
		this.launchExplosionChance = 0.05 * ((double) currentWeight / maxWeight);
		this.landingCrashChance = 0.01 * ((double) currentWeight / maxWeight);
	}

	@Override
	public void reset() {
		super.reset();
	}
}
