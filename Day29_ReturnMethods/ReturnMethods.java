import java.util.Arrays;
public class ReturnMethods {
	public static void main(String[] args){

		System.out.println(reverse("Java"));
	}

	public static String reverse(String str){
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		//System.out.println(result);
		return result;
	}
}