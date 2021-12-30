package day16_StringContinued;

import java.util.Scanner;
public class StringPractice3 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string with 3 letters: ");
		String word = scan.next();

		if (word.length() == 3){
			if (word.charAt(1) == 'a'){
				System.out.println("Cool word");
			}
		}else{
			if (word.length() > 3){
				System.out.println("Word is too long");
			}else if (word.length() < 3){
				System.out.println("Word is too short");
			}
		}

	}
}