package cruiseAssignment;

public class SunsetCruise extends CruiseDetails {

	@Override
	public int getNumOfDays() {

		return 1;
	}

	@Override
	public double getPriceForAdult() {

		return 52.99;

	}

	@Override
	public double getPriceForChildren() {

		return 15.99;

	}

	@Override
	public String getSelectedCruise() {
		return "Sunset Cruise";

	}

}