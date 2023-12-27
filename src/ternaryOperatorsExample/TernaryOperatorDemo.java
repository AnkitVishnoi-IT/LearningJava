package ternaryOperatorsExample;

public class TernaryOperatorDemo {
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int result = 0;

		if (num1 > num2) {
			result = num1 - num2;
		} else if (num1 < num2) {
			result = num2 - num1;
		}

		// if num1>num2 then do num1-num2, if num1<num2 then do num2-num1,
		// if num1==num2, return 0

		result = num1 > num2 ? num1 - num2 : num1 < num2 ? num2 - num1 : 0;

		System.out.println(result);

		String biggerNumber = num1 > num2 ? "Num1 is bigger" : "Num2 is bigger";

		System.out.println(biggerNumber);

	}

}
