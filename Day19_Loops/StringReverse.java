import java.util.*;
public class StringReverse {
	public static void main(String[] args){

		//String name = "Yahya";
		String name = new Scanner(System.in).nextLine();
		//index        01234
		String reverseName = "";

		for(int i = name.length() - 1; i >= 0; i--){
			reverseName += name.charAt(i);
		}
		System.out.println(reverseName);
	}
}