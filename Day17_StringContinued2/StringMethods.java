public class StringMethods {
	public static void main(String[] args){

		String sentence = "My favorite programming languages are: C#, Java, JavaScript";
		boolean hasPython = sentence.contains("Python");
		System.out.println(hasPython);
		boolean hasJava = sentence.contains("Java");
		System.out.println(hasJava);
	}
}