package dynamicInput;

public class OntarioLicenseEligibility {

	int age, currentLevel;
	

	void checkEligibility() {

		if (age >= 16 && currentLevel == 1) {
			System.out.println("Person has G1 level Licence so eligible to apply for G2");
		} else if (age >= 16 && currentLevel == 2) {
			System.out.println("Person has G2 level Licence so eligible to apply for G");

		} else if (age >= 16 && currentLevel == 3) {
			System.out.println("Person has G level Licence");
		} else if (age<16 && currentLevel == 0) {
			System.out.println("Not eligible");
		}
	}

}
