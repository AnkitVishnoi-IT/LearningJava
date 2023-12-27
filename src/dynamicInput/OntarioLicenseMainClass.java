package dynamicInput;

import java.util.Scanner;

public class OntarioLicenseMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OntarioLicenseEligibility eligibility = new OntarioLicenseEligibility();

		//eligibility.age = 12;

		//eligibility.currentLevel = "G1";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		
		eligibility.age = sc.nextInt();

			/*System.out.println("Please enter the curent level G1 or G2, or G or none (if person does not has any level of license) : ");
						
			eligibility.currentLevel = sc.next(); */

			System.out.println("Please enter 1 if the curent level G1 or 2 if the curent level G2, or 3 if the curent level G or 0 if person does not has any level of license) : ");
			
			eligibility.currentLevel = sc.nextInt();
		
			eligibility.checkEligibility();

			
		sc.close();


	}

}
