import java.util.Scanner;
public class Initial {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = scan.next();
		System.out.println("Enter your last name: ");
		String lastName = scan.next();

		String initial = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
		System.out.println(initial);

	}
}