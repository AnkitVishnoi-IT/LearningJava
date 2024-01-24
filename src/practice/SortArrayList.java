package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

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
			
			}
		}

		System.out.println("ArrayList: " + numbers);

		SortArray(numbers);

		System.out.println("Sortted ArrayList: " + numbers);
		
		sc.close();
	}

	private static void SortArray(ArrayList<Integer> list) {
		int size = list.size();
		int numOfSwaps = 0;

		do {

			for (int i = 1; i < size; i++) {
				if (list.get(i - 1) > list.get(i)) {
					int temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);

					numOfSwaps++;
				}
			}
			size--;
		} while (size > 1 && numOfSwaps > 0);
	}
}
