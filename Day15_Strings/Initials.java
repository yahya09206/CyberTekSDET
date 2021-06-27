import java.util.Scanner;
public class Initials {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String firstName = scan.nextLine();

		System.out.print("Please enter your last name: ");
		String lastName = scan.nextLine();

		System.out.println("Initials = " + firstName.charAt(0) + "." + lastName.charAt(0));
	}
}