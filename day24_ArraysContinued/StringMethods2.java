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

	}
}
/*
String methods:
	split(value): returns string array, splits the string by given value
	example:
		sentence = i love Java programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}
*/