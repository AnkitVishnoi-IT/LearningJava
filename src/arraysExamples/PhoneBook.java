package arraysExamples;

import java.util.Scanner;

public class PhoneBook {

	// Create an array of datatype to store 20 different values
	// Array Structure: DataType[] variable = new DataType[Length of the array]
	// Length is basically number of items in the array
	// So Max Index is always Length of the array -1
	// Serial number of items in array is called Index and always it start with 0
	// To specify the item of the array the syntax is variable[index of variable]

	long[] phoneNumbers = new long[5]; // Length if Array is 5 and max index is 5-1=4 as index starts with 0
	Scanner sc = new Scanner(System.in);
	// To Access a value or to store the value we will use the index

	void populateTheArray() {

		// to fill value in array is called populated the array
		// syntax to populate is: variable[index] = value;
		// for (int i=0; i<5; i++)
		// better to use variable for Length of the Array like below instead of
		// hard-coding as above

		for (int i = 0; i < phoneNumbers.length; i++) {
			System.out.println("Please enter the phone number:");
			phoneNumbers[i] = sc.nextLong();
		}

//		phoneNumbers[0]=9999900000L;
//		phoneNumbers[1]=9999900001L;
//		phoneNumbers[2]=9999900005L;
//		phoneNumbers[3]=9999900004L;
//		phoneNumbers[4]=9999900022L;
	}

//	void printTheArray() {
//
//		for (int i = 0; i < phoneNumbers.length; i++) {
//			System.out.println(phoneNumbers[i]);
//
//		}
	
	void printTheArray() {

		System.out.println("The phonenumbers stored in array are ");

		String arrayStringRepresentation = "[";
		
		for (int i = 0; i < phoneNumbers.length; i++) {

			arrayStringRepresentation = arrayStringRepresentation + phoneNumbers[i--] + ", ";
			
		}

		arrayStringRepresentation = arrayStringRepresentation + "]";

		System.out.println(arrayStringRepresentation);
	}

}
