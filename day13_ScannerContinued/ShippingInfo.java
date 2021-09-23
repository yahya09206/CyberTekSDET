import java.util.Scanner;
public class ShippingInfo {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("What is your building number? ");
		int builderNumber = scan.nextInt();	

		scan.nextLine();//only if nextline is placed after other method of scanner

		System.out.print("What is your street address? ");
		String address = scan.nextLine();

		System.out.print("What city do you live in? ");
		String city = scan.nextLine();

		System.out.print("What state do you live in? ");
		String state = scan.next();

		System.out.print("What is your zip code? ");
		String zipCode = scan.next();

		scan.nextLine(); //clear scanner
		System.out.print("What is your name? ");
		String fullName = scan.nextLine();

		System.out.println(fullName);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zipCode);
	}
}