import java.util.*;
public class DaysInWeek {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a day: ");
		int day = scan.nextInt();

		//Print out day based on user's input
		System.out.println((day == 1)? "Monday": (day == 2)? "Tuesday": "Not a valid day");
	}
}