public class StringMethods {
	public static void main(String[] args){

		String str = "Muhtar";
		//Get first character from string
		char ch = str.charAt(0);
		System.out.println("ch = " + ch);

		String word = "Cybertek School";
		System.out.println(word.charAt(9));
		System.out.println("--------------------");
		System.out.println("Length() Method");

		String sentence = "Hello everyone, how are you all today?";
		int totalNumberOfChars = sentence.length();
		System.out.println("totalNumberOfChars = " + totalNumberOfChars);

		String s1 = "Cybertek";
		System.out.println(s1.charAt(0) + " " + (s1.length()-1));

		System.out.println("--------------------");
		System.out.println("Concat() Method");
		String firstName = "John";
		String lastName = "King";

		String fullName = firstName + " " + lastName;
		String fullName2 = firstName.concat(" ").concat(lastName);
		System.out.println(fullName2);

		System.out.println("--------------------");
		System.out.println("toUpperCase() Method");
		String s = "cybertek";
		s = s.toUpperCase();
		System.out.println(s);

		System.out.println("--------------------");
		System.out.println("toLowerCase() Method");
	}
}