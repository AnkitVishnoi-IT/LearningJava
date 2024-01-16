package marsMissionSimulation;

public class R2 extends Rocket {

	public R2() {
		super(120, 18000, 29000);
		updateProbabilities();
	}

	@Override
	public void updateProbabilities() {
		this.launchExplosionChance = 0.04 * ((double) currentWeight / maxWeight);
		this.landingCrashChance = 0.08 * ((double) currentWeight / maxWeight);
	}

	@Override
	public void reset() {
		super.reset();
	}
}