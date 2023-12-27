package loops;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Login login = new Login();

		for (int attempts = 0; attempts < 3; attempts++) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter UserId :");
			login.enteredUserId = sc.next();

			System.out.println("Enter password :");
			login.enteredpassword = sc.next();

			login.loginCheck();

		}

		System.out.println("Account locked");
	}
}