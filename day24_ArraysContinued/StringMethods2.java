package day24_ArraysContinued;

import java.util.Arrays;

public class StringMethods2 {
	public static void main(String[] args){

		// split()
		String sentence = "I love learning java programming language";
		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		System.out.println("---------------------------------------------");

		String email = "James@gmail.com";

		String[] arrays = email.split("@");
		System.out.println(Arrays.toString(arrays));

		String firstName = arrays[0];

		System.out.println("firstName = " + firstName);


	}
}
/*
String methods:
	split(value): returns string array, splits the string by given value
	example:
		sentence = i love Java programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}
*/