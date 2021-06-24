import java.util.Scanner;

public class CentsToDollars {
	public static void main(String[] args){

		//Import scanner class
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Cents: ");
		int cents = scan.nextInt();
		int dollars = cents / 100;
		int remainder = cents % 100;

		if(cents >= 0) {
			if(remainder == 0){
			//Print out converted money
				System.out.println(cents + " cents = " + dollars + " dollars");
			}else {
				System.out.println(cents + " cents = " + dollars + " dollars and " + remainder + " cents");
			}else {
				System.out.println("Invalid amount");
			}
		}
	}
}