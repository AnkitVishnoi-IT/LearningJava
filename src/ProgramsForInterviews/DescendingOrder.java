package ProgramsForInterviews;

import java.util.Scanner;

public class DescendingOrder {

	Scanner sc = new Scanner(System.in);
	int i, j;

	double k;

	double arrayOfNum[];

	void descendingorder() {
		System.out.print("Enter the number of elements in the array : ");
		j = sc.nextInt();
		double arrayOfNum[] = new double[j];

		for (i = 0; i < arrayOfNum.length; i++) {
			System.out.println("Enter the element for index " + i);
			arrayOfNum[i] = sc.nextDouble();
		}
		System.out.print("Elements in the array are : [");
		for (int i = 0; i < arrayOfNum.length; i++) {

			System.out.print(arrayOfNum[i]);
			if (i < (arrayOfNum.length - 1))
				System.out.print(", ");
		}
		System.out.println("]");

		for (i = 0; i < arrayOfNum.length; i++) {
			for (int j = i; j < arrayOfNum.length; j++) {

				if (arrayOfNum[i] < arrayOfNum[j]) {
					k = arrayOfNum[i];
					arrayOfNum[i] = arrayOfNum[j];
					arrayOfNum[j] = k;
				}

			}
		}
		System.out.println("****************************************************");
		System.out.print("Elements of the array in descending order : [");
		for (int i = 0; i < arrayOfNum.length; i++) {

			System.out.print(arrayOfNum[i]);
			if (i < (arrayOfNum.length - 1))
				System.out.print(", ");
		}
		System.out.print("]");

	}

}
