import java.util.Scanner;
import java.lang.String; //lang package doesn't need to be explicity imported

public class StringIntro {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String str = "Cybertek";
		String str2 = new String("Cybertek");

		System.out.println("--------------------------------");

		String s1 = "Cat";
		String s2 = "CAt";
		String s3 = "Cat";
		System.out.println(s1 == s2);

		System.out.println("--------------------------------");
		String s4 = new String("Dog"); //New object in java heap is created
		String s5 = new String("Dog");
		String s6 = new String("Dog");

		System.out.println(s4 == s5);
		System.out.println(s5 == s6);
	}
}