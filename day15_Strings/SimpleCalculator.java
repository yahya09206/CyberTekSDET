package day15_Strings;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();

		int addition = num1 + num2;

		System.out.println("result: " + addition);
	}
}