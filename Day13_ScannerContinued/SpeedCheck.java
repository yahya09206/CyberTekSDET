import java.util.Scanner;
public class SpeedCheck {
	public static void main(String[] args){
		int speedLimit = 35;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your current speed: ");
		int currentSpeed = scan.nextInt();

		System.out.println("Current speed = " + currentSpeed);

		int overTheSpeedLimit = currentSpeed - speedLimit;
		if(overTheSpeedLimit > 0){
			System.out.println("You are driving " + overTheSpeedLimit + " over the speed limit. Slow Down!");
		}
	}
}