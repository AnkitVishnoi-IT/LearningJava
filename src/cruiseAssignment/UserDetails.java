package cruiseAssignment;

import java.util.Scanner;

public class UserDetails {

	Scanner sc = new Scanner(System.in);

	String userName, password, name, phNum, newInput, addAdult;
	int inputSelection, totalNumOfAdults, totalKids, ageOfKid, kidsAboveFive;

	public UserDetails(String userName, String password, String name, String phNum) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.phNum = phNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}

	public int getTotalNumOfAdults() {

		return totalNumOfAdults;

	}

	public void setTotalNumOfAdults() {

		while (true) {
			try {
				System.out.println("Enter the Number of Adults\n");

				this.totalNumOfAdults = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Invalid Input, Please Enter valid Number of Adults\n");
				sc.nextLine();
				continue;
			}

		}
	}

	public int getKidsAboveFive() {

		return totalKids;

	}

	public int setKidsAboveFive() {
		while (true) {
			try {
				System.out.println("Enter the Number of Children\n");

				this.totalKids = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Invalid Input, Please Enter valid Number of Children\n");
				sc.nextLine();
				continue;
			}
		}

		for (int i = 0; i <= totalKids; i++) {

			if (i > 0) {
				while (true) {
					try {
						System.out.println("Enter the age of child" + i + "\n");
						ageOfKid = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Invalid Input, Age can only be Numbers");
						sc.nextLine();
						continue;
					}
				}
				if (ageOfKid > 12) {
					System.out.println("Traveler is above kid's age limit and should be considered as Adult"
							+ "Type 'Add' to increase the number of adults.\n");
					addAdult = sc.nextLine();

					totalNumOfAdults = addAdult.equalsIgnoreCase("Add") ? totalNumOfAdults + 1 : totalNumOfAdults;
				}
			}

			if (ageOfKid <= 12 && ageOfKid >= 5) {
				kidsAboveFive++;
			}

		}
		return kidsAboveFive;
	}

	public void changeDetails() {
		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.\n");
		newInput = sc.next();
		if (newInput.equalsIgnoreCase("Y")) {
			do {
				System.out.println("******************************************************");
				System.out.println("Please enter the information you want to change.\n");
				System.out.println("Please Enter '1' to change Password");
				System.out.println("Please Enter '2' to change Phone number");
				System.out.println("Please Enter '3' to change Email");
				inputSelection = sc.nextInt();
				if (inputSelection == 1 || inputSelection == 2 || inputSelection == 3) {

					for (int attempts = 0; attempts < 3; attempts++) {

						System.out.println("Enter your existing password");
						newInput = sc.next();

						if (newInput.equalsIgnoreCase(getPassword())) {

							switch (inputSelection) {

							case 1:
								System.out.println("Enter your new password\n");
								newInput = sc.next();
								setPassword(newInput);
								System.out.println("Your password has been changed!");
								System.out.println("Thank you for using the service!");
								break;
							case 2:
								System.out.println("Enter your new phone number\n");
								newInput = sc.next();
								setPhNum(newInput);
								System.out.println("Your phone number has been changed!");
								System.out.println("Thank you for using the service!");
								break;
							case 3:
								System.out.println("Enter your new email\n");
								newInput = sc.next();
								setUserName(newInput);
								System.out.println("Your email has been changed!");
								System.out.println("Thank you for using the service!");
								break;
							default:
								System.out.println("Incorrect Field Selected");

							}

							break;
						}

						else if (attempts < 2) {
							System.out.println("Incorrect password.Try again");

						} else {
							System.out.println("Incorrect password multiple times - Exiting System");
							System.exit(0);
						}

					}

				} else {
					System.out.println("Incorrect Input");
				}
			}

			while (!(inputSelection == 1 || inputSelection == 2 || inputSelection == 3));

		} else {
			System.out.println("Exiting System");

		}
	}

}
