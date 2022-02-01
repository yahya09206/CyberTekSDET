package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args){

		int[] array = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(array));

		int[] nums = new int[5];
		System.out.println(Arrays.toString(nums));

		// sort(): sorts the elements of the array in ascending order
		String[] students = {"Bob", "Abbos", "Aysu", "Sabir"};

		Arrays.sort(students);
		System.out.println(Arrays.toString(students));

		int[] numbers = {9, 10, 4, 1, 3, -1, 0, 1, 2};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}