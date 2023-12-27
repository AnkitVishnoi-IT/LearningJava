package loops;

import java.util.Scanner;

public class SwitchExample {

	int num1, num2;

	double result;

	Scanner sc = new Scanner(System.in);

	String operation = "";

	void performOperation() {

		System.out.println("Enter the operation you want to perform \n" + "add, subtract, multiply or divide");

		operation = sc.next();

		switch (operation) {

		case "add":
			result = num1 + num2;
			System.out.println("Result is: " + result);
			break;
		case "subtract":
			result = num1 - num2;
			System.out.println("Result is: " + result);
			break;
		case "multiply":
			result = num1 * num2;
			System.out.println("Result is: " + result);
			break;
		case "divide":
			result = num1 / num2;
			System.out.println("Result is: " + result);
			break;

		default:
			System.out.println("Unsupported operation");

		}

	}

}
