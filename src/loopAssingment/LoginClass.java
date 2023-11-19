package loopAssingment;

import java.util.Scanner;

public class LoginClass {

	Scanner sc = new Scanner(System.in);
	String savedUserId = "pivotAdmin", savedpassword = "Admin123", enteredUserId, enteredpassword;

	void loginCheck() {
		for (int attempts = 0; attempts <= 3; attempts++) {

			System.out.println("Enter UserId :");
			enteredUserId = sc.next();

			System.out.println("Enter password :");
			enteredpassword = sc.next();

			if (enteredUserId.equals(savedUserId) && enteredpassword.equals(savedpassword)) {
				System.out.println("You are logged in to the application");
				break;
			}

			else if (attempts < 3) {
				System.out.println("Incorrect User id or password.Try again");

			} else {
				System.out.println("Account locked");
			}

		}

	}
}