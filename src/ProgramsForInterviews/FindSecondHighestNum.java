package ProgramsForInterviews;

import java.util.Scanner;

public class FindSecondHighestNum {

	Scanner sc = new Scanner(System.in);
	int i, j;

	double k;

	double arrayOfNum[];

	void secondHighest() {
		System.out.print("Enter the number of elements in the array : ");
		j = sc.nextInt();
		double arrayOfNum[] = new double[j];
		double maxnum = arrayOfNum[0], secondMaxnum;
		int indexOfMax;

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

		for (int i = 0; i < arrayOfNum.length; i++) {
			if (arrayOfNum[i] > maxnum) {
				secondMaxnum = maxnum;
				maxnum = arrayOfNum[i];
				indexOfMax = i;

				for (int j = arrayOfNum.length - 1; j > indexOfMax; j--) {
					if (arrayOfNum[j] > secondMaxnum && arrayOfNum[j] < maxnum) {

						secondMaxnum = arrayOfNum[j];
						
					}
				}
				System.out.println("Max Number is : " + maxnum);

				System.out.println("Second largest number in the array: " + secondMaxnum);

			}

		}

	}

}