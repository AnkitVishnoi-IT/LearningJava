package arraysExamples;

import java.util.Arrays;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBook phoneBook = new PhoneBook();
		phoneBook.populateTheArray();

		// System.out.println(phoneBook.phoneNumbers);
		//instead of giving phoneNymbers above syso gives the address of the memory where these ph# are saved, like : [J@7a5d012c
		//So we will create another method in the class and call that method her like below:
		phoneBook.printTheArray();
		
		//Or we can call method toString from the inbuilt Java class 'Arrays' as below:
		
		System.out.println(Arrays.toString(phoneBook.phoneNumbers));
		
	}

}
