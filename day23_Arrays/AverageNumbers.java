package day23_Arrays;

import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		// store value entered from user into array to get size
		int[] numbers = new int[scan.nextInt()];
		int sum = 0;

		for (int i = 0; i <= numbers.length - 1; i++){
			// prompt user to enter numbers of length equal to numbers var
			System.out.println("Enter a number");
			// reassign numbers var to have values entered
			numbers[i] = scan.nextInt(); // assign use rinput to indexes of array which are 5 in total
			// add numbers to each other using sum var
			sum += numbers[i]; // returns sum of elements in array
		}
		System.out.println("sum = " + sum);
		// find average of numbers by dividing sum and length of numbers array
		double average = (double) sum / numbers.length;
		System.out.println("Average = " + average);
		scan.close();

	}
}
