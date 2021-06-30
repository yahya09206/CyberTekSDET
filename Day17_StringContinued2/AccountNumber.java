import java.util.Scanner;
public class AccountNumber {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your account number: ");
		String account = scan.next();
		char firstChar = account.charAt(0);

		// if(account.length() == 7 || account.length() == 10){
		// 	if(account.charAt(0) == '2' && account.length() == 7){
		// 		System.out.println("Valid Account Number");
		// 	}else if(account.charAt(0) == '5' && account.length() == 10){
		// 		System.out.println("Valid Account Number");
		// 	}else {
		// 		System.out.println("Invalid");
		// 	}
		// }else {
		// 	System.out.println("Invalid Account Number")
		// }

		//With Switch Statement
		switch (firstChar) {
			case '2':
				if(account.length() == 7){
					System.out.println("Valid Account");
				}else {
					System.out.println("INVALID: should be 7 characters long");
				}
				break;
			case '5':
				if(account.length() == 10){
					System.out.println("Valid Account");
				}else {
					System.out.println("INVALID: it should be 10 characters long");
				}
				break;
			default:
				System.out.println("INVALID: first character needs to be 2 or 5");
		}
		scan.close();
	}
}