package day15_Strings;

import java.util.Scanner;

public class Initials {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scanner.next();
		System.out.println("Enter your last name");
		String lastName = scanner.next();
		scanner.close();

//		System.out.println(firstName.substring(0,1) + "." + lastName.substring(0,1));

		char f = firstName.charAt(0);
		char l = lastName.charAt(0);

		System.out.println(f + "." + l);

	}
}

/*
Ask user to enter:
	1. first name
	2. last name

then print the initials
	ex: Daniel
		Jones
 */