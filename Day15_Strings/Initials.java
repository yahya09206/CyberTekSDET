import java.util.Scanner;
public class Initials {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		//String firstName = scan.next();
		//Get first char of first name
		char f = scan.next().charAt(0);

		System.out.print("Please enter your last name: ");
		//String lastName = scan.next();
		char l = scan.next().charAt(0);
		scan.close();

		// System.out.println("Initials = " + firstName.charAt(0) + "." + lastName.charAt(0));

		System.out.println("Initials = " + f + "." + l);
	}
}