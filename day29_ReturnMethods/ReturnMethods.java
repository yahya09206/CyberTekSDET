import java.util.Arrays;
public class ReturnMethods {
	public static void main(String[] args){

		System.out.println(reverse("Java"));
		boolean isPalindrome = isPalindrome("level");
		System.out.println(isPalindrome);
	}

	public static String reverse(String str){
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		//System.out.println(result);
		return result;
	}

	public static boolean isPalindrome(String str){
		String reversedStr = reverse(str);
		// if (reversedStr.equalsIgnoreCase(str)) {
		// 	System.out.println(str + " is palindrome");
		// }else {
		// 	System.out.println(str + " is not palindrome");
		// }
		return reversedStr.equalsIgnoreCase(str) ? true : false;
	}


}