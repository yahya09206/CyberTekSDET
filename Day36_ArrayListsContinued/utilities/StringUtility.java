package utilities;
import java.util.Arrays;
public class StringUtility {
	public static String reverse(String str){
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		//System.out.println(reverse);
		return reverse;
	}

	//method to check for palindrome
	public static boolean isPalindrome(String str){
		String reversedStr = reverse(str);
		return str.equalsIgnoreCase(reversedStr);
		//long way
		// for (String each : words) {
		// 	String reverse = "";
		// 	for (int i = each.length() - 1; i >= 0; i--) {
		// 		reverse += each.charAt(i);
		// 	}
		// 	boolean isPalindrome = reverse.equalsIgnoreCase(each);
		// 	words.removeIf(p -> isPalindrome);
		// }
	}


	//method to remove duplicates
	public static String removeDuplicates(String str){
		//store result into new string
		String result = "";

		//for each loop to change string elements into chars
		for (char ch : str.toCharArray() ) {
			//check if index of char is less than 0
			if (result.indexOf(ch) < 0) {
				//if char is not contained in result, then concat the char
				result += ch;
			}
		}

		return result;
	}

	//method to check if two words are anagrams of each other
	public static boolean isAnagram(String str1, String str2){
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();	

		//sort both arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}

	//method to check frequency of character
	public static int frequency(String str, char ch){
		int count = 0;

		//convert string to array
		for (char each : str.toCharArray()) {
			//check if string index is equal to character index
			if(each == ch){
				count++;
			}
		}

		return count;
	}

	//unique characters
	public static String uniqueCharacters(String str){
		String unique = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char each = str.charAt(i);
			int frequency = frequency(str, each);
			if (frequency == 1) {
				unique += each;
			}
		}
		return unique;
	}

	//returns the frequency of each character
	public static String frequencyOfChars(String str){
		String result = "";
		for(char each : removeDuplicates(str).toCharArray()){
			//get frequency of each char
			int frequency = frequency(str, each);
			result += each;
			result += frequency;
		}
		return result;
	}

	//returns frequency of word in the string
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