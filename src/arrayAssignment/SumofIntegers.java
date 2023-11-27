package arrayAssignment;

import java.util.Scanner;

public class SumofIntegers {

	Scanner sc = new Scanner(System.in);

	int[] intArray = { -40, -5, 1, 3, 6, 7, 8, 20 };

	void findTheNumbers() {

		System.out.println("Please Enter the desired Sum:");
		int sumOfInt = sc.nextInt();

		for (int i = 0; i < intArray.length; i++) {
			for (int j = i++; j < intArray.length; j++)

				if (!(intArray[i] + intArray[j] == sumOfInt)) {
				} else {
					System.out.println("Sum of: " + intArray[i] + " & " + intArray[j] + " is: " + sumOfInt);
					continue;
				}
		}

	}
}