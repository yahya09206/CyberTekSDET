public class StringMethods {
	public static void main(String[] args){

		String sentence = "My favorite programming languages are: C#, Java, JavaScript";
		boolean hasPython = sentence.contains("Python");
		boolean hasJava = sentence.contains("Java");
		boolean hasJava2 = sentence.toLowerCase().contains("java");
		System.out.println(hasPython);
		System.out.println(hasJava);
		System.out.println(hasJava2);

	}
}