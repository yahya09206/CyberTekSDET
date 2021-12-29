package day15_Strings;

//import java.lang.String;

public class StringIntro {
	public static void main(String[] args){

		//Scanner scan = new Scanner(System.in);
		String str1 = "Cybertek"; // string literal
		String str2 = new String("Cybertek"); // new keyword

		System.out.println("--------------------------------------------");

		String s1 = "Cat";
		String s2 = "CAt";
		String s3 = "Cat";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println("--------------------------------------------");

		String s4 = new String("Dog");
		String s5 = new String("Dog");
		String s6 = new String("Dog");
		String s7 = s4;

		System.out.println(s4 == s5);
		System.out.println(s5 == s6);
		System.out.println(s7 == s4);

	}
}