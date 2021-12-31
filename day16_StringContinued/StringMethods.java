package day16_StringContinued;

public class StringMethods {
	public static void main(String[] args){

		String email = "Cybertek@gmail.com";
		email.replace("yahoo", "gmail");
		System.out.println(email);

		String sentence = "C# is cool, C# is fun";
		//sentence = sentence.replace("C#", "Java");
		sentence = sentence.replaceFirst("C#", "Java");
		System.out.println(sentence);




	}
}