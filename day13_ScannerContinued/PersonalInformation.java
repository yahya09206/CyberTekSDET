import java.util.Scanner;
public class PersonalInformation {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your salary: ");
		int salary = scan.nextInt();

		System.out.print("Enter your gender: ");
		String gender = scan.next();

		scan.nextLine(); //Clear out scanner

		System.out.print("Enter your full name: ");
		String fullName = scan.nextLine();

		System.out.print("Enter your job title: ");
		String jobTitle = scan.nextLine();

		System.out.println("Salary = " + salary);
		System.out.println("Gender = " + gender);
		System.out.println("fullName = " + fullName);
		System.out.println("jobTitle = " + jobTitle);
	}
}