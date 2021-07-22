import java.util.Arrays;
public class WarmUpTasks {
	public static void main(String[] args){

		String str = "ZMMMMMMMMMMFFFFFFFDDDDDDSLSLLLLLDDDDKKKEEEEEE";
		System.out.println(removeDuplicates(str));
		System.out.println("-------------------------------------");
		System.out.println(isAnagram("heart", "earth"));
		System.out.println("-------------------------------------");
		int n1 = frequency(str, 'M');
		System.out.println("n1 = " + n1);
		System.out.println("-------------------------------------");
		
		//loop to find unique char
		String s = "aaaaaaabcccccccccdeeeeef";
		System.out.println(unique);

		System.out.println("-------------------------------------");
		//find frequency of a b and c
		String s3 = "AAABBCCCC";
					removeDuplicates(s3);

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
	public static boolean isAnagram(String str1, String str2){
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();	

		//sort both arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

	}

	//method to check frequency of character
	public static int frequency(String str, char ch){
		int count = 0;

		//convert string to array
		for (char each : str.toCharArray()) {
			//check if string index is equal to character index
			if(each == ch){
				count++;
			}
		}

		return count;
	}

	//unique characters
	public static String uniqueCharacters(String s){
		String unique = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char each = str.charAt(i);
			int frequency = frequency(str, each);
			if (frequency == 1) {
				unique += each;
			}
		}
		return unique;
	}
}