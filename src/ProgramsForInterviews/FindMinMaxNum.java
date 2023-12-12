package ProgramsForInterviews;

import java.util.Scanner;

public class FindMinMaxNum {

	Scanner sc = new Scanner(System.in);
	int i, j;
	double arrayOfNum[] = new double[4];
	// double arrayOfNum[]= new double [j];

	void populateArray() {

//		System.out.print("Enter the number of elements in the array : ");
//		j = sc.nextInt();

//		double arrayOfNum[] = new double[j];

		for (i = 0; i < arrayOfNum.length; i++) {
			// System.out.println("Enter the element for index " + i);
			System.out.println("Enter the elements one by one and press enter after each element");
			arrayOfNum[i] = sc.nextDouble();

		}
//		System.out.print("Elements of the array are : [");
//
//		for (int i = 0; i < arrayOfNum.length; i++) {
//
//			System.out.print(arrayOfNum[i]);
//			if (i < (arrayOfNum.length - 1))
//				System.out.print(", ");
//		}
//		System.out.print("]");
//
	}

	void findmax() {
		double maxnum = arrayOfNum[0];

		for (i = 0; i < arrayOfNum.length; i++) {

			if (arrayOfNum[i] > maxnum) {
				maxnum = arrayOfNum[i];

			}

		}
		System.out.println("Largest number is: " + maxnum);
	}

	void findmin() {
		double minnum = arrayOfNum[0];

		for (i = 0; i < arrayOfNum.length; i++) {

			if (arrayOfNum[i] < minnum) {
				minnum = arrayOfNum[i];

			}

		}
		System.out.println("Smallest number is: " + minnum);
	}
}
