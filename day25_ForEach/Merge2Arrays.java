package day25_ForEach;

import java.util.Arrays;

public class Merge2Arrays {
	public static void main(String[] args){

		int[] arr1 = {1,2,3,4},
				arr2 = {5,6};

		int[] arr3 = new int[arr1.length + arr2.length];

		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[j++] = arr1[i];
		}

		System.out.println(Arrays.toString(arr3));
	}
}