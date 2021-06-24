import java.util.Scanner;
public class PersonalInformation {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your salary: ");
		int salary = scan.nextInt();

		System.out.print("Enter your gender: ");
		String gender = scan.next();

		System.out.print("Enter your full name: ");
		String fullName = scan.nextLine();
	}
}