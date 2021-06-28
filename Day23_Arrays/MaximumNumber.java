import java.util.Scanner;
public class MaximumNumber {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter? ");
		int[] numbers = new int[scan.nextInt()];
		int sum = 0;

		for(int i = 0; i <= numbers.length; i++){
			System.out.println("Enter a number: ");
			numbers[i] = scan.nextInt();
			sum += numbers[i]; //Returns the sum of the elements in the array
		}

		System.out.println("Sum = " + sum);
		double average = (double) sum / numbers.length;
		System.out.println("average = " + average);
		scan.close();
	}
}
