package day19_Loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		String result = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			result += name.charAt(i);
		}
		if (result.equals(name)){
			System.out.println("Is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}