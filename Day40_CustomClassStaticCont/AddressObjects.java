import java.util.Scanner;
public class AddressObjects {
	public static void main(String[] args){

		Addresss address = new Addresss();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your building number");
		String buildingNumber = scan.next();

		scan.nextLine();
		System.out.println("Enter your street name");
		String streetName = scan.nextLine();

		System.out.println("Enter your city name");
		String city = scan.nextLine();

		System.out.println("Enter your state name");
		String state = scan.nextLine();

		System.out.println("Enter your zipCode");
		int zipCode = scan.nextInt();

		address.setInfo(buildingNumber, streetName, city, state, zipCode);
		System.out.println(address);
	}
}