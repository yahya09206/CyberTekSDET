package day16_StringContinued;

import java.util.Scanner;

public class StringPractice1 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scan.next();
		String result = "";
		if (string.length() < 0){
			result = "String is empty";
		}

	}
}

/**
 * 1. write a method that ask user to enter a string
 * 	if the string is empty, print: string is empty
 * 	if the string has more than 3 characters, print the last three characters
 * 	if the string has less than 3 characters, print the string itself
 * */