package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find its factors: ");
		int num = sc.nextInt();

		sc.close();

		ArrayList<Integer> factors = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors.add(i);
			}
		}

		System.out.println("------------------------------------------");
		System.out.println("Factors of " + num + " are as following :");
		for (int factor : factors) {
			System.out.println("* " + factor);
		}
	}

}