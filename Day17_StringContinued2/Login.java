import java.util.Scanner;
public class Login {
	public static void main(String[] args){

		String correctUserName = "Cybertek@gmail.com";
		String correctPassword = "Cybertek123";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String userName = scan.next();

		System.out.println("Enter your password: ");
		String password = scan.next();

		boolean canLogIn = userName.equalsIgnoreCase(correctUserName) && password.equalsIgnoreCase(correctPassword);

		if (canLogIn) {
			System.out.println("Logged in successfully!");
		}else {
			System.out.println("Invalid username or password");
		}
	}
}