import java.util.Arrays;
public class FirstUniqueCharacter {
	public static void main(String[] args){

		String str = "aaaaabccddefggggh";

		for (char each : str.toCharArray()) {
			if (str.indexOf(each) == str.lastIndexOf(each)) {
				
			}
		}
	}
}