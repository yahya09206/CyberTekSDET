import java.util.Arrays;
public class ReturnMethods {
	public static void main(String[] args){

		System.out.println(reverse("Java"));
		isPalindrome("level");
	}

	public static String reverse(String str){
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		//System.out.println(result);
		return result;
	}

	public static void isPalindrome(String str){
		String reversedStr = reverse(str);
		if (reversedStr.equalsIgnoreCase(str)) {
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
		}
	}
}