import java.util.Scanner;
public class AccountNumber {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your account number: ");
		String account = scan.next();

		if(account.length() == 7 || account.length() == 10){
			if(account.charAt(0) == '2' && account.length() == 7){
				System.out.println("Valid Account Number");
			}else if(account.charAt(0) == '5' && account.length() == 10){
				System.out.println("Valid Account Number");
			}else {
				System.out.println("Invalid");
			}
		}else {
			System.out.println("Invalid Account Number")
		}
	}
}