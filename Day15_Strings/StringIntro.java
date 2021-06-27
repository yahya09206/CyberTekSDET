import java.util.Scanner;
import java.lang.String; //lang package doesn't need to be explicity imported

public class StringIntro {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String str = "Cybertek";
		String str2 = new String("Cybertek");

		System.out.println("--------------------------------");

		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = "Cat";

		System.out.println(s1 == s2);

	}
}