import java.util.Scanner;
public class SpeedCheck {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your current speed: ");
		int currentSpeed = scan.nextInt();

		System.out.println("Current speed = " + currentSpeed);
	}
}