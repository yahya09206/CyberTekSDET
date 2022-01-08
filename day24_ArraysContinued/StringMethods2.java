package day24_ArraysContinued;

public class StringMethods2 {
	public static void main(String[] args){

		// split()
		String sentence = "I love learning java programming language";
		sentence.split(" ");
	}
}
/*
String methods:
	split(value): returns string array, splits the string by given value
	example:
		sentence = i love Java programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}
*/