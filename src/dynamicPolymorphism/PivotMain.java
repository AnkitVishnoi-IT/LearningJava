package dynamicPolymorphism;

import java.util.Scanner;

public class PivotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Please provide your pesonal name: ");
//		String inputName = sc.next();
//		System.out.println("Please provide a brief about yourself: ");
//		String inputBrief = sc.next();
//		System.out.println("Create Username: ");
//		String inputUsername = sc.next();
//		System.out.println("Create Password: ");
//		String inputPassword = sc.next();
//
//		StudentDetails student = new StudentDetails(inputName, inputBrief, inputUsername, inputPassword);
//
		WebLogin web = new WebLogin();
		
		web.uploadAssignment();
		
		AppLogin app = new AppLogin();
		
		app.joinTodayClass();
		
	}

}
