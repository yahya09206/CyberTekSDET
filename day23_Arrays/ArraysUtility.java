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

		System.out.println(Arrays.toString(students));

		int[] numbers = {9,10,4,1,3,-1,0,1,2};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("Minimum number: " + numbers[0]);
		System.out.println("Maximum number: " + numbers[numbers.length - 1]);

		char[] chars = {'z', 'b', 'k', 'a', 'c', 'y', 'x'};
		System.out.println(Arrays.toString(chars));
		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));

		// equals(arr1, arr2): for comparing two arrays
		int[] num1 = {1,2,3};
		int[] num2 = {1,2,3};

		int[] num3 = {3,2,1};
		int[] num4 = {2,3,1};

		System.out.println("Arrays.equals(num1, num2) = " + Arrays.equals(num1, num2));


	}
}