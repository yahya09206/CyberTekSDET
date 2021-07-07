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

		//if correct on first attempt
		if(u.equals(correctUsername) && p.equals(correctPassword)){
			System.out.println("Logged In");
		}else {

			//give user 3 tries to enter credentials
			for(int i = 1; i <= 3; i++){
				System.out.println("username or password is incorrect, please re-enter");
				System.out.println("Enter your username:");
				u = scan.next();
				System.out.println("Enter your password:");
				p = scan.next();

				//if correct after first attempt
				if(u.equals(correctUsername) && p.equals(correctPassword)){
					System.out.println("Logged In");
					break;
				}
				// if attempts is equal to 3, lock account
				if(i == 3){
					System.out.println("Your account is locked");
					System.exit(0);
				}
			}
		}
		// print successful logged in message
		System.out.println("Hello CyberTek");
		scan.close();
	}
}