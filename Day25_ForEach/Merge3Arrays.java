import java.util.Arrays;
public class Merge3Arrays {
	public static void main(String[] args){
		int[] arr1 = {1,2,3,11};
		int[] arr2 = {4,5,6};
		int[] arr3 = {7,8,9,12,13,14};

		//Set array to be size of 3 array lengths combined
		int arr4 = new int[arr1.length + arr2.length + arr3.length];

		//variable to keep track of where previous arrays left off
		int j = 0;
		//loop thru array 1
		for(int i = 0; i < arr1.length; i++){
			//assign first four indexes of first array to new array
			// arr4[i] = arr1[i];
			arr4[j++] = arr1[i];
		}

		//loop thru array 2
		for(int i = 0; i < arr2.length; i++){
			//start from where first array ended
			// arr4[i + i + arr1.length + arr2.length] = arr2[i];
			arr4[j++] = arr2[i];
		}

		for(int i = 0; i < arr3.length; i++){
			arr4[j++] = arr3[i];
		}

		System.out.println(Arrays.toString(arr4));
	}
}