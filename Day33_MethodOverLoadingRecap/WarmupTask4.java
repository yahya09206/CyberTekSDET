import java.util.Arrays;
public class WarmupTask4 {
	public static void main(String[] args){
		String str = "aaabbbbbbcc";
		String result = "";
		for (int i = 0; i < str.length() - 1; i++) {
			char each = str.charAt(i);
			if (!result.contains("" + each)) {
				result += each;
			}
		}
		System.out.println(result);
	}
}