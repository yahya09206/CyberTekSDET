package day15_Strings;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){

		// Lunch tasks program 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String word = scanner.nextLine();

		String result = "";
		if (word.length() > 5){
			result = "Too long!";
		}else if (word.length() < 5){
			result = "Too short!";
		}else {
			result += word.charAt(4);
			result += word.charAt(3);
			result += word.charAt(2);
			result += word.charAt(1);
			result += word.charAt(0);
		}

		System.out.println("result = " + result);
	}
}