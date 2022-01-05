package day22_Recap;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Do you want to continue?");
	}
}