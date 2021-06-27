public class StringMethods {
	public static void main(String[] args){

		String str = "Muhtar";
		//Get first character from string
		char ch = str.charAt(0);
		System.out.println("ch = " + ch);

		String word = "Cybertek School";
		System.out.println(word.charAt(9));
		System.out.println("--------------------");
		System.out.println("Length Method");

		String sentence = "Hello everyone, how are you all today?";
		int totalNumberOfChars = sentence.length();
		System.out.println("totalNumberOfChars = " + totalNumberOfChars);


	}
}