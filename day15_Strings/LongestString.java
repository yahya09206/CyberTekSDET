package day15_Strings;

import java.util.Scanner;

public class LongestString {
	public static void main(String[] args){

		// Lunch tasks program 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence = scanner.nextLine();
		char lastChar = sentence.charAt(sentence.length()-1);
		System.out.println(sentence.charAt(0) + ", " + lastChar);

		// program 2
		System.out.println("Enter two strings");
		String string1 = scanner.next();
		String string2 = scanner.next();
		if (string1.length() > string2.length()){
			System.out.println(string1);
		}else {
			System.out.println(string2);
		}
	}
}