package cruiseAssignment;

public class MysteryCruise extends CruiseDetails {
	@Override
	public int getNumOfDays() {

		return 2;
	}

	@Override
	public double getPriceForAdult() {

		return 45.99;

	}

	@Override
	public double getPriceForChildren() {

		return 12.99;

	}

	@Override
	public String getSelectedCruise() {
		return "Mystery Cruise";

	}
}
