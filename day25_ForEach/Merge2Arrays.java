package day25_ForEach;

public class Merge2Arrays {
	public static void main(String[] args){

		int[] arr1 = {1,2,3,4},
				arr2 = {5,6};
		// set size of 3rd array to same length as arr1 and arr2 combined
		int[] arr3 = new int[arr1.length + arr2.length];

		// declare variable to represent index numbers of third array
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			// increment j so it can move to next index and store new element
			arr3[j++] = arr1[i];
		}
	}
}