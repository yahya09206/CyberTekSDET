import java.util.Scanner;
public class ScannerMethods {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("Are you a full time employee? ");
		boolean isFullTime = scan.nextBoolean();

		System.out.print("Are you an adult? ");
		boolean isAdult = scan.nextBoolean();

		System.out.print("Are you married? ");
		boolean isMarried = scan.nextBoolean();

		System.out.println("isFullTime " + isFullTime);
		System.out.println("isAdult " + isAdult);
		System.out.println("isMarried " + isMarried);


	}
}