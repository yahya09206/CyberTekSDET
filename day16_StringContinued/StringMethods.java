package day16_StringContinued;

public class StringMethods {
	public static void main(String[] args){

		String email = "Cybertek@gmail.com";
		email.replace("yahoo", "gmail");
		System.out.println(email);

		String sentence = "C# is cool, C# is fun";
		//sentence = sentence.replace("C#", "Java");
		sentence = sentence.replaceFirst(", C#", "Java");
		System.out.println(sentence);

		// char doesn't have a replace method
//		char ch = 'a';
//		ch.replace('a');

		String s = "Cat Dog Cat Dog Cat";
		s = s.replaceFirst("Cat", "Dog");
		System.out.println(s);

		System.out.println("---------------------------------------------------------");
		String sentence2 = "Java is a cool language";
		int indexOfFirstA = sentence2.indexOf("a");
		int indexOfSecondA = sentence2.indexOf("a ");
		int indexOfThirdA = sentence2.lastIndexOf("a");
		int indexOfFourthA = sentence2.indexOf("an");
		System.out.println(indexOfFirstA);
		System.out.println(indexOfSecondA);
		System.out.println(indexOfThirdA);
		System.out.println(indexOfFourthA);

		System.out.println("---------------------------------------------------------");
		String s2 = "Hello";
		boolean r1 = s2.isEmpty();
		System.out.println("r1 = " + r1);
	}
}