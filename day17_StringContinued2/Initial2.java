package day17_StringContinued2;

import java.util.Scanner;

public class Initial2 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName = scan.nextLine(); //Cybertek School

		String firstName = fullName.substring(0, fullName.indexOf(" "));
	}
}