package day21_WhileDoWhile;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("Enter a number:");
			int n = scan.nextInt();

			if (n < 0){
				break;
			}
		}

	}
}