public class StringMethods {
	public static void main(String[] args){

		String email = "Cybertek@yahoo.com";
		email = email.replace("yahoo", "gmail");
		System.out.println(email);

		String sentence = "C# is cool, C# is fun";
		// sentence = sentence.replace("C#", "Java");
		System.out.println(sentence);

		sentence = sentence.replaceFirst("C#", "Java");
		System.out.println(sentence);

		System.out.println("-------------------------");
		String sentence2 = "Java is a cool language";
		int indexOfFirstA = sentence2.indexOf("a");
		int indexOfSecondA = sentence2.indexOf("a ");
		int indexOfThirdA = sentence2.indexOf(" a ");
		System.out.println(indexOfFirstA);
		System.out.println(indexOfSecondA);
		System.out.println(indexOfThirdA);
	}
}