package loopAssignment;

public class FillAndAlarmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FillWaterAndAlarm fillAndAlarm = new FillWaterAndAlarm();

		fillAndAlarm.tankCapacity = 100;
		fillAndAlarm.bucketCapacity = 10;
		fillAndAlarm.breakPoint = 90;

		fillAndAlarm.fillTank();

	}

}
