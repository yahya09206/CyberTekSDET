import java.util.*;

public class ScannerIntro {
	public static void main(String[] args){

		//Declaring Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two numbers ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The sum of number 1 and number 2 are " + (num1 + num2));
	}
}