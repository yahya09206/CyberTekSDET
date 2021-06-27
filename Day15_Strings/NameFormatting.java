import java.util.Scanner;
public class NameFormatting {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your first name: ");

		String firstName = scan.nextLine().trim();

		String formatName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		System.out.println(formatName);
	}
}