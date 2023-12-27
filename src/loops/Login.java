package loops;

import java.util.Scanner;

public class Login {

	String savedUserId = "pivotAdmin", savedpassword = "Admin123", enteredUserId, enteredpassword;

	void loginCheck() {

		if (enteredUserId.equals(savedUserId) && enteredpassword.equals(savedpassword)) {
			System.out.println("You are logged in to the application");
			// break;
		}

		else {
			System.out.println("Incorrect User id or password.Try again");

			}

		}
}