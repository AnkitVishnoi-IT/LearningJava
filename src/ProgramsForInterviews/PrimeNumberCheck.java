package ProgramsForInterviews;

import java.util.Scanner;

public class PrimeNumberCheck {

	Scanner sc = new Scanner(System.in);
	boolean isNumberPrime;

	void checkPrimeNumber() {

		System.out.println("Enter any number to check whether it is a Prime number: ");
		int i = sc.nextInt();

		if (i == 0 || i == 1) {
			System.out.println(i + " is not a Prime Number");
			isNumberPrime = false;
		} else if (i == 2) {
			System.out.println(i + " is a Prime Number");
			isNumberPrime = true;
		} else {

			for (int j = 2; j < i; j++) {

				if (!(i % j == 0)) {

					isNumberPrime = true;
				}

				else {
					isNumberPrime = false;
					break;

				}
			}
			if (isNumberPrime) {
				System.out.println(i + " is a Prime Number");
			}

			else {
				System.out.println(i + " is not a Prime Number");
			}

		}
	}

	void continuechecking() {
		System.out.println("********************************************************");
		System.out.println("Type Y if you want to check another number");
		String executeagain = sc.next();
		if (isNumberPrime == true && executeagain.equalsIgnoreCase("Y")) {

			checkPrimeNumber();
		}

		else if (isNumberPrime == false && executeagain.equalsIgnoreCase("Y")) {
			checkPrimeNumber();
		} else {
			System.out.println("Program Terminated");
			System.exit(0);
		}
		continuechecking();

	}
}
