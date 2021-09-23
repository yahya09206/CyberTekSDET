public class RemoveDuplicateFromString {
	public static void main(String[] args){

		String word = "abcdabc";
		String result = ""; // one 'ab' at end;

		//get every character in string
		for(int i = 0; i < word.length(); i++){
			if(!result.contains("" + word.charAt(i))){
				result += word.charAt(i);
			}
		}
		System.out.println("result = " + result);
	}
}