import java.util.Arrays;
public class StringMethods {
	public static void main(String[] args){
		String sentence = "I love learning java programming";

		//Split sentence by spaces
		String[] words = sentence.split(" ");
		//Print array in regular order
		System.out.println(Arrays.toString(words));

		//Loop to split array
		for(int i = words.length-1; i >= 0; i--){
			System.out.print(words[i] + " ");
		}
	}
}
/*
String methods:
	split(value): returns string array, splits the string by given value
	example:
		sentence = i love programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}
*/