package day24_ArraysContinued;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args){

		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] newArr = new int[arr.length];

		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--){
			newArr[j++] = arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
}