import java.util.Scanner;
public class AccountNumber {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your account number: ");
		String account = scan.next();

		if(account.length() == 7 || account.length() == 10){
			if(account.charAt(0) == '2' && account.length() == 7){
				System.out.println("Valid account");
			}
		}
	}
}