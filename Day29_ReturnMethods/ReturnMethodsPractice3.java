import java.util.Arrays;
public class ReturnMethodsPractice3 {
	public static void main(String[] args){


	}
	public static String removeDuplicates(String str){
		String result = ""; //"ABC"
		for( String each : str.split(" ")){
			if (!result.contains(each)) {
				result += each;
			}
		}
		return "";
	}
}