package day24_ArraysContinued;

import java.util.Arrays;

public class ClassMates {
	public static void main(String[] args){

		String[] classMates = {"Gulistan", "Feruza", "Ahmet", "Nazli", "Kadir", "Mahmet", "Aykut", "Ahmad", "Tamara",
				"Abbos"};

		System.out.println(Arrays.toString(classMates));

		for (int i = 0; i <= classMates.length - 1; i++) {
			System.out.println("classMates[i].substring(0,4) = " + classMates[i].substring(0, 4));
		}
	}
}