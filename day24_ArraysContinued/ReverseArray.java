package day24_ArraysContinued;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args){

		int[] nums = {1,2,3,4,5,6};
		int[] result = new int[nums.length];

		for (int i = nums.length - 1, j = 0; i >= 0; i--) {
			result[j++] = nums[i];
		}
		System.out.println(Arrays.toString(result));
	}
}