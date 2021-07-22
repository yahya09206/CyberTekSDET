package utilities;
public class StringUtility {
	public static void main(String[] args){
		reverse("what it do babay");
	}

	//Reverse string
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

	//unique characters
	public static String uniqueCharacters(String s){
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

}