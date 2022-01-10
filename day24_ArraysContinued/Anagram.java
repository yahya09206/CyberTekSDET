package day24_ArraysContinued;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args){

		String firstWord = "earth";
		String secondWord = "heart";

		char[] characters1 = firstWord.toCharArray();
		char[] characters2 = secondWord.toCharArray();

		Arrays.sort(characters1);
		Arrays.sort(characters2);

		System.out.println(Arrays.toString(characters1));
		System.out.println(Arrays.toString(characters2));



	}
}