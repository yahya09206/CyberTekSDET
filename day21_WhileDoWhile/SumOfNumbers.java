package day21_WhileDoWhile;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = 0;

		while(n >= 0){
			System.out.println("Enter a number:");
			n = scan.nextInt();

			if (n < 0){
				break;
			}

			sum += n;
		}
		System.out.println("sum = " + sum);
	}
}