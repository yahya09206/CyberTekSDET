package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args){

		// toString
		int[] array = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(array));

		String[] array2 = new String[5];
		System.out.println(Arrays.toString(array2));

		int[] array3 = new int[5];
		System.out.println(Arrays.toString(array3));

		double[] array4 = new double[5];
		System.out.println(Arrays.toString(array4));

		System.out.println("--------------------------------------");
		// sort() : sorts the elements of the array in ascending order

		String[] students = {"Boburbek", "Aysu", "Abbos", "Savir"};
		// call to string method, for strings you can't simply just call .sort on it you need to call toString first
		System.out.println(Arrays.toString(students));
		// call sort method after printing out array
		Arrays.sort(students);
		// print sorted array
		System.out.println(Arrays.toString(students));

		int[] numbers = {9, 10, 4, 1, 3, -1, 0, 1, 2};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);

		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length - 1]);

		char[] chars = {'z', 'b', 'k', 'a', 'c', 'y', 'x'};
		System.out.println(Arrays.toString(chars));

		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));

		// equals(arr1, arr2) ==> return true or false
		int[] num1 = {1,2,3};
		int[] num2 = {1,2,3};

		boolean r1 = Arrays.equals(num1, num2);
		System.out.println("r1 = " + r1);




	}
}