package arraysExamples;

import java.util.Scanner;

public class UserInfo {

	// String[][] users = new String[3][2];
	String[][] users = { { "pivot@gmail.com", "abcue12" }, { "riya@gmail.com", "sss@12" },
			{ "lal@gmail.com", "ath@12" } };
	Scanner sc = new Scanner(System.in);

	void populateUsers() {
		System.out.println("Enter Username:");
		String username = sc.next();

		boolean userFound = false;
		int i = 0;
		for (; i < users.length; i++) {

			if (users[i][0].equalsIgnoreCase(username)) {
				userFound = true;

				// for (int j = 0; j < users[i].length; j++) {

				break;
			}
		}
		if (userFound) {
			System.out.println("User Found " + "index is [" + i + "][" + users[i].length + "] and Password is :"
					+ users[i][(users[i].length) - 1]);
		} else {
			System.out.println("User not found in the system.");
		}
		// users[i][j] = sc.next();
	}

}
