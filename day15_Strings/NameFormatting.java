package day15_Strings;

import java.util.Scanner;

public class NameFormatting {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();

		String firstLetter = name.substring(0,1).toUpperCase().trim();
		String restOfName = name.substring(1).toLowerCase().trim();
		System.out.println(firstLetter + restOfName);


	}
}
/*
ask the user to enter firs name
	1. make sure there is no white space
	2. make sure first character is uppercase and rest of the characters need to be in lowercase
 */