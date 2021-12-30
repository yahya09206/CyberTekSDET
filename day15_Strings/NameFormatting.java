package day15_Strings;

import java.util.Scanner;

public class NameFormatting {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine().trim();

		// My Way
		String firstLetter = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		//String restOfName = name.substring(1).toLowerCase().trim();
		System.out.println(firstLetter);

		System.out.println("Enter your last name");
		String lastName = scan.nextLine().trim();
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
		System.out.println(lastName);


	}
}
/*
ask the user to enter firs name
	1. make sure there is no white space
	2. make sure first character is uppercase and rest of the characters need to be in lowercase
 */