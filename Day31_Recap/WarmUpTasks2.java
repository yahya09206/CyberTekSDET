import utilities.isPalindrome;
public class WarmUpTasks2 {
	public static void main(String[] args){

		String sentence = "Java Java JaVA";
		String word = "java";
		System.out.println(frequencyOfWord(sentence, word));
		Systme.out.println("----------------------------------");
		String str = "Racecar";
		boolean isPalindrome = StringUtility,isPalindrome(str);

	}

	//method to remove instances of specific word
	public static int frequencyOfWord(String sentence, String word){
		int count = 0;
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		if (sentence.contains(word)) {
			sentence = sentence.replace(word, "");
			count++;
		}
		//return count
		return count;
	}
}