import java.util.Arrays;
public class FirstUniqueCharacter {
	public static void main(String[] args){

		String str = "aaaaab ccddefggggh";

		for (char each : str.replace(" ", "").toCharArray()) {
			if (str.indexOf(each) == str.lastIndexOf(each)) {
				System.out.println(each);
				break;
			}
		}
	}
}