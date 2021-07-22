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

}