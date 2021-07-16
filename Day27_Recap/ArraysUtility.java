import java.util.Arrays;
public class ArraysUtility {
	public static void main(String[] args){

		int[] nums = {1,2,3};
		int[] number = Arrays.copyOf(nums, 5);
		System.out.println(Arrays.toString(number));

		System.out.println("------------------------------------");
		//Loop to merge two arrays using one loop
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8,9};

		//int[] arr3 = new int[arr1.length + arr2.length];
		int[] arr3 = Arrays.copyOf(arr1, arr1.length + arr2.length);
		System.out.println(Arrays.toString(arr3));

		//declar variable to start from end of arr1
		int i = arr1.length;
		for (int each : arr2) {
			//store elements of arr2 starting from where arr1 ended
			arr3[i++] = each;
		}
		System.out.println(Arrays.toString(arr3));

		System.out.println("------------------------------------");
		//copyOfRange()
	}
}