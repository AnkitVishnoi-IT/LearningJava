package ProgramsForInterviews;

import java.util.Scanner;

public class FibonacciSeries {

	int n1 = 0, n2 = 1, n3 = 0, count;

//	void fibonacci() {
//
//		System.out.print(n1 + " " + n2);// printing 0 and 1
//
//		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
//		{
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//		}
//	}

	void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

}
