package day19_Loops;

import java.util.Scanner;

public class RemoveDuplicateFromString {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		String result = "";

		for (int i = 0; i <= word.length() - 1; i++) {
			if (!result.contains("" + word.charAt(i))){
				result += word.charAt(i);
			}
		}
		System.out.println("result = " + result);
	}
}