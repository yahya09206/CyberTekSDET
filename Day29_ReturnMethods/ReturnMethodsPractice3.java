import java.util.Arrays;
public class ReturnMethodsPractice3 {
	public static void main(String[] args){


	}
	public static String removeDuplicates(String str){
		String result = ""; //"ABC"
		//split string by spaces
		for( String each : str.split(" ")){
			//if character isn't not contained
			if (!result.contains(each)) {
				//add to result
				result += each;
			}
		}
		return "";
	}
}