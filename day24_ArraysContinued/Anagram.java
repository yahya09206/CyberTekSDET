package day24_ArraysContinued;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args){

		String str1 = "earth";
		String str2 = "heart";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean isAnagram = Arrays.equals(ch1, ch2);

		System.out.println("isAnagram = " + isAnagram);

	}
}