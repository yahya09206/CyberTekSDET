package utilities;
public class StringUtility {
	public static void main(String[] args){
		reverse("what it do babay");
	}

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
}