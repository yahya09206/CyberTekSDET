package day22_Recap;

import java.util.Scanner;

public class RoomReservation {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int totalPrice = 0;

		System.out.println("Welcome to Cybertek Hotel");
		System.out.println("Would you like to reserve a room?");
		String answer = scan.nextLine().toLowerCase();

		if (answer.equals("yes")){
			System.out.println("Which bed type do you want?");
			String type = scan.nextLine().toLowerCase();
			if (type.equals("king bed")){
				totalPrice += 120;
			}else if (type.equals("queen bed")){
				totalPrice += 100;
			}else if (type.equals("single bed")){
				totalPrice += 80;
			}else {
				System.out.println("Invalid room is selected");
			}

			System.out.println("Do you want to reserve another room?");
			answer = scan.nextLine().toLowerCase();

			while (!(answer.equals("yes") || answer.equals("no"))){
				System.out.println("Invalid Entry, please re-enter");
				answer = scan.nextLine().toLowerCase();
			}
		}

		System.out.println("Your total price is: " + totalPrice);
	}
}