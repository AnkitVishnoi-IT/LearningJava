package loopAssignment;

public class FillWaterTank {

	int waterlevel=10;
	int numOfbucketspoured = 0;

	void fillTank() {

		if (waterlevel <100) {
			System.out.println("Water Level in Tank: " + waterlevel);
			System.out.println("Pour next Bucket");
			waterlevel += 10;

		} else {
			System.out.println("Water Level in Tank: " + waterlevel);
			System.out.println("Tank Full. Stop");
		}

	}
}
