package ProgramsForInterviews;

import java.util.Scanner;

public class FibonacciSeriesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciSeries setcount = new FibonacciSeries();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the series: ");
		setcount.count = sc.nextInt();
		System.out.print(setcount.n1 + " " + setcount.n2);// printing 0 and 1
		setcount.printFibonacci(setcount.count - 2);// n-2 because 2 numbers are already printed
	}
}