public class StringMethods {
	public static void main(String[] args){

		String sentence = "My favorite programming languages are: C#, Java, JavaScript";
		boolean hasPython = sentence.contains("Python");
		boolean hasJava = sentence.contains("Java");
		boolean hasJava2 = sentence.toLowerCase().contains("java");
		System.out.println(hasPython);
		System.out.println(hasJava);
		System.out.println(hasJava2);

		System.out.println("--------------------------------------");
		String sentence2 = "Cybertek School is the best";
		boolean startWithCybertek = sentence2.startsWith("Cybertek");
		boolean endsWithSchool = sentence2.endsWith("best");

		System.out.println("startWithCybertek = " + startWithCybertek);
		System.out.println("endsWithCybertek = " + endsWithSchool);


	}
}