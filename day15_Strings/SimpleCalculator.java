package day15_Strings;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Enter a math operator:");
		char mathOperator = scanner.next().charAt(0);

		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();

		double result = 0;
		switch (mathOperator){
			case '-':
				result = num1 - num2;
				break;
			case '+':
				result = num1 + num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
		}
	}
}