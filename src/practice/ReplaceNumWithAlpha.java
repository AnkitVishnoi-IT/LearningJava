package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceNumWithAlpha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice;

		do {
			ArrayList<Integer> numbers = new ArrayList<>();
			int number;

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

			char[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			ArrayList<String> resultArrayList = new ArrayList<>();

			boolean isNumberValid = true;

			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) >= 1 && numbers.get(i) <= 26) {
					int j = numbers.get(i) - 1;
					resultArrayList.add(String.valueOf(alpha[j]));
				} else {
					System.out.println("Invalid number entered. Only numbers up to 26 can be converted to alphabet.");
					isNumberValid = false;
					break;
				}
			}

			if (isNumberValid) {
				System.out.println("ArrayList with alphabets is : " + resultArrayList);
			}

			System.out.println("Do you want to try again? (Y/N): ");
			choice = sc.nextLine().toUpperCase();
		} while (choice.equalsIgnoreCase("Y"));

		sc.close();
	}
}