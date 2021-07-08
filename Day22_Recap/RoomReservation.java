import java.util.Scanner;
public class RoomReservation {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int totalPrice = 0;

		System.out.println("Welcome to CyberTek Hotel");
		System.out.println("Would you like to reserve a room?");
		String answer = scan.next().toLowerCase();

		while(answer.equals("yes")){
			System.out.println("Which bed type do you want?");
			String bedType = scan.nextLine().toLowerCase();

			if(bedType.equals("king bed")){
				totalPrice += 120;
			}else if(bedType.equals("queen bed")){
				totalPrice += 100;
			}else if(bedType.equals("single bed")){
				totalPrice += 80;
			}else {
				System.out.println("Invalid room is selected");
			}

			System.out.println("Do you want to reserve another room?");
			answer = scan.nextLine().toLowerCase();
		}

		System.out.println("Your total price is: " + totalPrice);
	}
}