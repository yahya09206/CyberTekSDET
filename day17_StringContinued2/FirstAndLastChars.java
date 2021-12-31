package day17_StringContinued2;

import java.util.Scanner;

public class FirstAndLastChars {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.nextLine();

		String first = word.substring(0,1);
		String last = word.substring(word.length()-1);

		if (first.equalsIgnoreCase(last)) {
			System.out.println("Same");
		}else {
			System.out.println("Not the same");
		}
	}
}