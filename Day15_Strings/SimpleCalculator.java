import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double num1 = scan.nextDouble();

		System.out.print("Enter a math operator: ");
		char mathOperator = scan.next().charAt(0);

		System.out.print("Enter your second number: ");
		double num2 = scan.nextDouble();

		double result = 0;
	}
}