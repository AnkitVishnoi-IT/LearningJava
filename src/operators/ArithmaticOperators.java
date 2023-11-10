package operators;

public class ArithmaticOperators {

	int num1, num2;
	double no1, no2;

	void add() {

		int sum = num1 + num2;

		System.out.println("Sum is " + sum);
	}

	void subtract() {

		int difference = num1 - num2;

		System.out.println("Difference is " + difference);
	}

	void multiply() {

		int product = num1 * num2;

		System.out.println("Product is " + product);
	}

	void divison() {

		int quotient = num1 / num2;

		int remainder = num1 % num2;

		System.out.println("Quotient is " + quotient);
		System.out.println("Remainder is " + remainder);

	}

	void divide() {

		double quotient = no1 / no2;

		System.out.println("Quotient is " + quotient);

	}

}
