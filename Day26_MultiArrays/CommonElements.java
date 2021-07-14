import java.util.Arrays;
public class CommonElements {
	public static void main(String[] args){

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7,8,9,10,11};

		for (int element : arr2 ) {
			//iterate thru first array
			for (int each : arr1 ) {
				if (each == element) {
					System.out.println(each);
				}
			}
		}

		System.out.println("----------------------------------------");
		//reverse iterate thru 2nd array
		for (int i = arr2.length - 1; i >= 0; i--) {
			//iterate thru 1st array
			for (int j = 0; j < arr1.length; j++) {
				//check if elements from second array math with elements from first array, then print
				if (arr2[i] == arr1[j]) {
					System.out.println(arr2[i]);
				}
			}
		}
	}
}