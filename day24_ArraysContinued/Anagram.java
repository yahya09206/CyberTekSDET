package day24_ArraysContinued;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args){

		// find if two string are anagrams of each other
		String word1 = "earth";
		String word2 = "Java";

		// convert strings to charArrays
		char[] string1 = word1.toCharArray();
		char[] string2 = word2.toCharArray();

		System.out.println(Arrays.toString(string1));
		System.out.println(Arrays.toString(string2));

		Arrays.sort(string1);
		Arrays.sort(string2);

		System.out.println(Arrays.toString(string1));
		System.out.println(Arrays.toString(string2));

		if (Arrays.equals(string1, string2)){
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}


	}
}