import java.util.Scanner;
public class Credentials {
	public static void main(String[] args){

		String correctUsername = "cybertek";
		String correctPassword = "cybertek12345";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String u = scan.next();

		System.out.println("Enter your password: ");
		String p = scan.next();

		if(u.equals(correctUsername) && p.equals(correctPassword)){
			System.out.println("Logged In");
		}else {
			System.out.println("username or password is incorrect, please re-enter");
			System.out.println("Enter your username:");
		}

	}
}