package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		int number;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers for array list (press Enter to finish):");
		String input = sc.nextLine();
		String[] inputArray = input.split("\\s+");

		for (String numStr : inputArray) {
			try {
				number = Integer.parseInt(numStr);
				numbers.add(number);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter valid integers.");
				// Handle invalid input if needed
			}
		}

		System.out.println("ArrayList: " + numbers);

		sc.close();

		int minNumber = findMin(numbers);
		int maxNumber = findMax(numbers);

		System.out.println("Minimum Number: " + minNumber);
		System.out.println("Maximum Number: " + maxNumber);
	}

	private static int findMin(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		// return Collections.min(list);

		int min = list.get(0); //  // Another way

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}

		return min;
	}

	private static int findMax(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		// return Collections.max(list);
		int max = list.get(0); // Another way

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		return max;
	}
}