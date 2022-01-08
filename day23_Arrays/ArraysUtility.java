package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args){

		int[] array = {1,2,3,4,5,6};
		System.out.println(array);

		// toString
		System.out.println(Arrays.toString(array));

		String[] array2 = new String[5];

		System.out.println(Arrays.toString(array2));

		int[] nums = new int[5];

		System.out.println(Arrays.toString(nums));

		// sort(): sorts the elements of the array in ascending order

		String[] students = {"Boburbek", "Aysu", "Abbos", "Sabit"};


		System.out.println(Arrays.toString(students));
		Arrays.sort(students);


	}
}