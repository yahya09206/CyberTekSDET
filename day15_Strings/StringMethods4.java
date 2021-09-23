public class StringMethods4 {
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
		String s2 = "JAVA PROGRAMMING LANGUAGE";
		s2 = s2.toLowerCase();
		System.out.println(s2);


		System.out.println("--------------------");
		System.out.println("trim() Method");
		String schoolName = "    Cybertek School";
		schoolName = schoolName.trim();
		System.out.println(schoolName);

		System.out.println("--------------------");
		System.out.println("replace() Method");
		String sentence3 = "Python is an easy language";
		sentence3 = sentence3.replace("Python", "Java");
		System.out.println(sentence3);

		String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
		sentence4 = sentence4.replace("C#", "Java");
		System.out.println(sentence4);

		String sentence5 = "Dog is friendly, Dog is loyal, I love Dogs";
		sentence5 = sentence5.replace("Dog", "Cat");
		System.out.println(sentence5);

	}
}