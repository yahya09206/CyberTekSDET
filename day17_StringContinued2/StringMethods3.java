package day17_StringContinued2;

public class StringMethods3 {
	public static void main(String[] args){

		String sentence = "My favorite programming languages are: C#, Java, Javascript";
		boolean hasPython = sentence.contains("Python");
		boolean hasJava = sentence.contains("Java");
		boolean hasJava2 = sentence.toUpperCase().contains("Java");

		System.out.println("hasJava = " + hasPython);
		System.out.println("hasJava = " + hasJava);
		System.out.println("hasJava2 = " + hasJava2);

	}
}