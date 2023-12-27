package loopAssignment;

public class AmusementParkMaxLimit {

	int personOnRide = 0;
	double height;

	void allowToRide() {

		if (height > 90 && height < 200) {
			System.out.println("Allowed");
			personOnRide++;

		} else {
			System.out.println("Not allowed");
		}

	}
}