package day16_StringContinued;

import java.util.Scanner;
public class StringPractice2 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String word1 = scan.next();
		String word2 = scan.next();

		String result = word1.substring(1) + word2.substring(1);
		System.out.println(result);
	}
}