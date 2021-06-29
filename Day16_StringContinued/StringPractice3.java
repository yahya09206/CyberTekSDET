import java.util.Scanner;
public class StringPractice3 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string with 3 letters: ");
		String word = scan.next();

		if(word.length() == 3){
			if(word.charAt(1) == 'a'){
				System.out.println("Cool word");
			}else {
				System.out.println("Okay word");
			}
		}else { // if word has more than 3 or less than 3 characters
			if(word.length() < 3){
				System.out.println("Word is too short");
			}else {
				System.out.println("Word is too long");
			}
		}
		scan.close();
	}
}