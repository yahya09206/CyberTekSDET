package day23_Arrays;

import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int[] numbers = new int[scan.nextInt()];
		int sum = 0;

		for (int i = 0; i <= numbers.length - 1; i++){
			System.out.println("Enter a number");
			numbers[i] = scan.nextInt();
			sum += numbers[i];
		}
		double avg = (double) sum / numbers.length;
		System.out.println(avg);
	}
}
