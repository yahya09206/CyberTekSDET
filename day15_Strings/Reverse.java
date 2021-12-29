package day15_Strings;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){

		// Lunch tasks program 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String word = scanner.nextLine();

		if (word.length() > 5){
			System.out.println("Too long!");
		}else if (word.length() < 5){
			System.out.println("Too short!");
		}else {
			System.out.print(word.charAt(4));
			System.out.print(word.charAt(3));
			System.out.print(word.charAt(2));
			System.out.print(word.charAt(1));
			System.out.print(word.charAt(0));
		}
	}
}