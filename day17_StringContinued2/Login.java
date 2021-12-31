package day17_StringContinued2;

import java.util.Scanner;

public class Login {
	public static void main(String[] args){

		String correctUsername = "Cybertek@gmail.com";
		String correctPassword = "Cybertek123";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();

		boolean canLogIn = userName.equalsIgnoreCase(correctUsername) && password.equalsIgnoreCase(correctPassword);

		if (canLogIn){
			System.out.println("Successfully logged in");
		}else {
			System.out.println("Wrong credentials");
		}



	}
}