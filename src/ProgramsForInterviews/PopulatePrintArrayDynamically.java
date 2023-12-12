package ProgramsForInterviews;

import java.util.Scanner;

public class PopulatePrintArrayDynamically {

	Scanner sc = new Scanner(System.in);
	int i, j;

	double arrayOfNum[];

	void populateAndPrintArray() {

		System.out.print("Enter the number of elements in the array : ");
		j = sc.nextInt();
		double arrayOfNum[] = new double[j];

		for (i = 0; i < arrayOfNum.length; i++) {
			System.out.println("Enter the element for index " + i);
			arrayOfNum[i] = sc.nextDouble();
		}
		System.out.print("Elements of the array are : [");
		for (int i = 0; i < arrayOfNum.length; i++) {

			System.out.print(arrayOfNum[i]);
			if (i < (arrayOfNum.length - 1))
				System.out.print(", ");
		}
		System.out.print("]");

	}
}