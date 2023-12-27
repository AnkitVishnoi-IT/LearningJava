package PracticeComparison;

import java.util.Scanner;

public class UserNamePassword {

	Scanner sc = new Scanner(System.in);

	String savedUserName = "abc@gmail.com", savedPassword = "Admin123", inputUserName, inputPassword;

	void login() {

		for (int i = 0; i < 3; i++) {

			System.out.println("Please Enter a UserName:");
			inputUserName = sc.next();
			System.out.println("Please Enter a Password:");
			inputPassword = sc.next();

			if (savedUserName.equalsIgnoreCase(inputUserName) && savedPassword.equals(inputPassword)) {
		 		System.out.println("Login Successful");
				break;
			}

			else if (i < 2) {
				System.out.println("Try Again");
			}

			else {
				System.out.println("Account Locked");
				break;
			}
		}
	}
}
