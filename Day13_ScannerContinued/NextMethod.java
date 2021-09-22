import java.util.Scanner;
public class NextMethod {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = scan.next(); 

		System.out.print("Enter your last name: ");
		String lastName = scan.next();

		String fullName = firstName + " " + lastName;

		System.out.println("Full Name = " + fullName);

		System.out.println("Enter your address ");
		String address = scan.next();

		System.out.println("Address = " + address);


	}
}