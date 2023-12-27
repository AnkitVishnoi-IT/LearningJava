package cruiseAssignment;

public class ScenicCruise extends CruiseDetails {

	@Override
	public int getNumOfDays() {

		return 3;
	}

	@Override
	public double getPriceForAdult() {

		return 43.99;

	}

	@Override
	public double getPriceForChildren() {

		return 12.99;

	}

	@Override
	public String getSelectedCruise() {
		return "Scenic Cruise";

	}

}