package day17_StringContinued2;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args){

		String gmail = "Cybertek@gmail.com";
		String domain = gmail.substring(gmail.indexOf("@"));
		boolean isValidGmail = domain.equals("@gmail.com");
		boolean isValidGmail2 = domain.endsWith("@gmail.com");

		System.out.println("isValidGmail = " + isValidGmail);
		System.out.println("isValidGmail2 = " + isValidGmail2);

		System.out.println("---------------------------------------------");

		String url = "www.amazon.com";
		boolean isValidUrl = url.startsWith("www.") &&
				(url.endsWith(".com")) || url.endsWith(".edu") || url.endsWith(".gov");

		System.out.println(isValidUrl);

		System.out.println("---------------------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.next();

		boolean endsWithLY = word.substring(word.length() - 2).equals("ly");
		boolean endsWithLY2 = word.endsWith("ly");

		if (endsWithLY){
			System.out.println("really?");
		}else {
			System.out.println("Nevermind");
		}

		scan.close();

	}
}