package day19_Loops;

public class UniqueCharacters {
	public static void main(String[] args){

		String word = "aabcc";
		String result = "";

		for (int i = 0; i < word.length() - 1; i++) {
			char ch = word.charAt(i);
			boolean isUnique = word.indexOf(ch) == word.lastIndexOf(ch);

			if (isUnique){
				result += ch;
			}
		}
		System.out.println("result = " + result);

	}
}