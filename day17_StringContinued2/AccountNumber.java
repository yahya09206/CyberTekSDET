package day17_StringContinued2;

import java.util.Scanner;

public class AccountNumber {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your account number:");
		String account = scan.next();
		char firstChar = account.charAt(0);
		String result = "";
		switch (firstChar){
			case '2': // if the first character of account is 2
					if (account.length() == 7){
						result = "Valid Account";
					}else {
						result = "Invalid: should be 7 characters long";
					}
					break;
			case '5': // the first character of account is 5
				if (account.length() == 10){
					result = "Valid Account";
				}else {
					result = "Invalid: it should be 10 characters long";
				}
				break;
			default:
				result = "Invalid: first character needs to be 2 or 5";
		}
		System.out.println(result);

		/*
		if (account.length() == 7 || account.length() == 10){
			if (account.charAt(0) == '2' && account.length() == 7){
				System.out.println("Valid Account");
			}else if(account.charAt(0) == '5' && account.length() == 10){
				System.out.println("Valid Account");
			}else {
				System.out.println("Invalid account");
			}
		}else {
			System.out.println("Invalid Account");
		}
		 */


	}
}