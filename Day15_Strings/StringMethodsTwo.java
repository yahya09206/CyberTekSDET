public class StringMethodsTwo {
	public static void main(String[] args){

		String sentence = "Java Programming Language";
		String name = sentence.substring(0,4);
		System.out.println(name);

		String s2 = "Cybertek School";
		String name2 = s2.substring(0,8);
		System.out.println(name2);

		String name3 = s2.substring(9);
		System.out.println(name3);

		System.out.println("-----------------------------");
		String sentence2 = "Java is a programming language";
		String name4 = sentence2.substring(10);
		System.out.println(name4);
	}
}