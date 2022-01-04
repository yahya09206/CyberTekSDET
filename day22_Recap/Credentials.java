package day22_Recap;

import java.util.Scanner;

public class Credentials {
	public static void main(String[] args){

		String correctUsername = "cybertek";
		String correctPassword = "cybertek12345";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = scanner.next();

		System.out.println("Enter your password");
		String password = scanner.next();

		if (username.equals(correctUsername) && password.equals(correctPassword)){
			System.out.println("Logged in");
		}else {
			for (int i = 0; i <= 3; i++) {
				System.out.println("Invalid credentials");
				System.out.println("Enter your username");
				username = scanner.next();

				System.out.println("Enter your password");
				password = scanner.next();
			}
		}

	}
}