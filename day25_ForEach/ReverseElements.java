package day25_ForEach;

import java.util.Arrays;

public class ReverseElements {
	public static void main(String[] args){

		String[] array = {"Java", "Python", "C#"};


		for (int j = 0; j < array.length; j++) {
			String element = array[j]; // Element of the array
			String reverse = ""; // to store the reversed version of the element

			for (int i = element.length() - 1; i >= 0 ; i--) {
				reverse += element.charAt(i); // gets the characters from the string element
			}
			array[j] = reverse; // assigning reversed element to the index of the array
		}


		System.out.println(Arrays.toString(array));
	}
}