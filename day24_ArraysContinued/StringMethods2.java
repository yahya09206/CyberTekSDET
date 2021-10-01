package day24_ArraysContinued;

import java.util.Arrays;

public class StringMethods2 {
	public static void main(String[] args){

		// split
		String sentence = "I love learning java programming language";
		String[] words = sentence.split(" ");

		System.out.println(Arrays.toString(words));

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		System.out.println("-----------------------------");
		// split email by @ sign
		String email = "Cybertek@gmail.com";
		// get everything before @ sign at index 0
		String firstName = email.split("@")[0];
		System.out.println("firstName = " + firstName);

		System.out.println("-----------------------------");
		// toCharArray() splits characters up in string
		String str = "ABCDE";
		char[] characters = str.toCharArray();
		System.out.println(Arrays.toString(characters));

		// find if two string are anagrams of each other

	}
}
/*
String methods:
	split(value): returns string array, splits the string by given value
	example:
		sentence = i love Java programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}
*/