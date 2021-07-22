public class WarmUpTasks {
	public static void main(String[] args){

			String str = "MMMMMMMMMMFFFFFFFDDDDDDSLSLLLLLDDDDKKKEEEEEE";
			System.out.println(removeDuplicates(str));

	}
	//method to remove duplicates
	public static String removeDuplicates(String str){
		//store result into new string
		String result = "";

		//for each loop to change string elements into chars
		for (char ch : str.toCharArray() ) {
			//check if index of char is less than 0
			if (result.indexOf(ch) < 0) {
				//if char is not contained in result, then concat the char
				result += ch;
			}
		}

		return result;
	}

	//method to check if two words are anagrams of each other
	public static boolean 
}