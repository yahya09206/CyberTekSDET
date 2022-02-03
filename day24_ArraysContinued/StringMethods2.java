package day24_ArraysContinued;

import java.util.Arrays;

public class StringMethods2 {
	public static void main(String[] args){

		String sentence = "I love java programming language";

		String[] sentence2 = sentence.split(" ");

		System.out.println(Arrays.toString(sentence2));

		for (int i = sentence2.length - 1; i >= 0; i--){
			System.out.print(sentence2[i] + " ");
		}
		System.out.println();
		String email = "Cybertek@gmail.com";
		String firstName = email.split("@")[0];
		System.out.println("firstName = " + firstName);

		String str = "ABCDE";
		char[] chars = str.toCharArray();

		System.out.println(Arrays.toString(chars));



	}
}
/*
String methods:
	split(value): returns string array, splits the string by given value
	example:
		sentence = i love Java programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}
*/