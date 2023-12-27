package loopAssignment;

public class FillWaterAndAlarm {

	int currentWaterLevel;
	int tankCapacity;
	int bucketCapacity;
	int breakPoint;

	void fillTank() {

		for (currentWaterLevel = 0; currentWaterLevel <= breakPoint; currentWaterLevel += bucketCapacity) {

			System.out.println("Current water level in tank: " + currentWaterLevel + "lt");

			if (currentWaterLevel == breakPoint) {
				System.out.println("Stop! Tank Full");
				break;
			}
		}
	}

}
