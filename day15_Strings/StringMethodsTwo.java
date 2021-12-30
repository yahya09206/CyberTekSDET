package day15_Strings;

public class StringMethodsTwo {
	public static void main(String[] args){

		String sentence = "Java Programming Language";
		// second number stops one short
		String name = sentence.substring(0,3);
		System.out.println(name);

		String s2 = "Cybertek School";
		String name2 = s2.substring(0, 7 + 1);
		System.out.println(name2);

		System.out.println("----------------------------------------");
		String sentence3 = "Python is an easy language";
		sentence3.replace("Python", "Java");
	}
}