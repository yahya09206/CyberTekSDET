import java.util.Arrays;
public class Merge2Arrays {
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4},
				arr2 = {5,6};

		int[] arr3 = new int[arr1.length + arr2.length]; //Adding length of both arrays so it can be the same size of the two added together

		int j = 0; // for the indexes of third array
		for(int i = 0; i < arr1.length; i++){ //loop thru arr1
			arr3[j++] = arr1[i];
		}

		for(int i = 0; i < arr2.length; i++){ //loop thru arr2
			arr3[j++] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));


	}
}