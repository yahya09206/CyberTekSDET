import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args){
		
		//toString - used when you want to print entire array
		int[] array = {1,2,3,4,5,6};
		System.out.println(array);

		//Formatted array values
		System.out.println(Arrays.toString(array));

		String[] array2 = new String[5];
		System.out.println(array2);
		System.out.println(Arrays.toString(array2));

		int[] nums = new int[5];
		System.out.println(Arrays.toString(nums));

		double[] nums2 = new double[5];
		System.out.println(Arrays.toString(nums2));

		// sort(): sorts the elements of the array in ascending order
		String[] students = {"Boburbek", "Aysu", "Abbos", "Sabir"};
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));

		int[] numbers = {9,10,4,1,3,-1,0,1,2};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));


	}
}