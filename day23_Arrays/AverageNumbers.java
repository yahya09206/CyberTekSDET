package day23_Arrays;

import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int[] size = new int[scanner.nextInt()];
		int sum = 0;

		for (int i = 0; i <= size.length - 1; i++){
			System.out.println("Enter next number");
			size[i] = scanner.nextInt();
			sum += size[i];
		}

		double average = (double) (sum / size.length -1);
		System.out.println("average = " + average);
	}
}
