package loopAssignment;

import java.util.Scanner;

public class WaterTankMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FillWaterTank startFilling = new FillWaterTank();

		for (int i = startFilling.numOfbucketspoured; i < 10; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 to add another Bucket water : ");
			Thread.sleep(2000);
			startFilling.numOfbucketspoured = sc.nextInt();
			startFilling.fillTank();

			

		}
	}
}