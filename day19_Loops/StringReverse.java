package day19_Loops;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		String result = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			result += name.charAt(i);
		}
		System.out.println("result = " + result);

	}
}