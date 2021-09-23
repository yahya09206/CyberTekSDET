import java.util.Scanner;
public class FreeShipping {
	public static void main(String[] args){

		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the price of the item: ");
		 double price = scan.nextDouble();

		 System.out.print("Are you a prime member? ");
		 boolean isPrime = scan.nextBoolean();

		 double totalPrice = (isPrime)? price :(price>=25)? price :price + 3.99;

		 System.out.println("Total Price: = $" + totalPrice);
	}
}