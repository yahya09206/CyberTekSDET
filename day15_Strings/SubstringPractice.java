package day15_Strings;

public class SubstringPractice {
	public static void main(String[] args){

		String sentence = "My favorite TV series is The Walking Dead";
		String tvSeries = sentence.substring(25);
		System.out.println(tvSeries);

		String sentence2 = "Java is a fun language";
		String s1 = sentence2.substring(10, 13);
		System.out.println(s1);

		String s2 = sentence2.substring(14);
		System.out.println(s2);

	}
}