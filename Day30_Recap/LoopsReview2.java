import java.util.Scanner;
public class LoopsReview2 {
	public static void main(String[] ars){

		Scanner scan = new Scanner(System.in);
		String answer = "";
		int n = 0;

		while(!answer.equals("no")){
			System.out.println("Enter a number: ");
			n = scan.nextInt();
			System.out.println("Would you like to enter another number?");
			answer = scan.next().toLowerCase();
			//check for valid answer
			while(!(answer.equals("yes") || answer.equals("no"))){
				System.out.println("Would you like to enter another number?");
				answer = scan.next();
			}
		}
		System.out.println("Your number was " + n);
	}
}