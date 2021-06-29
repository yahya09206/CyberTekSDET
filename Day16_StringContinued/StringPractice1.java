import java.util.Scanner;
public class StringPractice1 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = scan.next();

		if(word.length() == 0){
			System.out.println("String is empty!");
		}else if(word.length() > 3){
			System.out.println(word.substring(word.length() - 3));
		}
	}
}