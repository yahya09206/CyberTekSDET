package utilities;
import java.util.Arrays;
public class ArraysUtilities {
	
	public static int[] addElement(int[] array, int number){
		int i = 0;
		int[] result = new int[array.length + 1];
		for (int each : array ) {
			result[i++] = each;
		}
		result[i] = number;
		//using copyOf() method
		// int[] result = Arrays.copyOf(array, array.length + 1);
		// result[result.length - 1] = number;
		return result;
	}

	//method to add double to end of array
	public static double[] addElement(double[] array, double number){
		int i = 0;
		double[] result = new double[array.length + 1];
		for (double each : array ) {
			result[i++] = each;
		}
		result[i] = number;
		return result;
	}

	//method to add string to end of array
	public static String[] addElement(String[] array, String str){
		int i = 0;
		String[] result = new String[array.length + 1];
		for (String each : array) {
			result[i++] = each;
		}
		result[i] = str;
		return result;
	}

	//method to add char to array
	public static char[] addElement(char[] array, char ch){
		 char[] result = Arrays.copyOf(array, array.length + 1);
		 result[result.length - 1] = ch;
		 return result;
	}

	//method to return max from array on integer
	public static int max(int[] array){
		int max = 0;
		for (int each : array) {
			max = Math.max(each, max);
		}
		return max;
	}

	public static double max(double[] array){
		double max = 0;
		for (double each : array) {
			max = Math.max(each, max);
		}
		return max;
	}

	public static int min(int[] array){
		int min = 0;
		for (int each : array) {
			min = Math.min(each, min);
		}
		return min;
	}

	public static double min(double[] array){
		double min = 0;
		for (double each : array) {
			min = Math.min(each, min);
		}
		return min;
	}

	//merge to arrays of int
	public static int[] merge(int[] arr1, int[] arr2){
		int[] arr3 = new int[arr1.length + arr2.length];
		int j = 0;
		//one foreach per data structure
		for(int each : arr1){
			arr3[j++] = each;
		}

		for (int each : arr2) {
			arr3[j++] = each;
		}
		return arr3;
	}


	public static double[] merge(double[] arr1, double[] arr2){
		double[] arr3 = new double[arr1.length + arr2.length];
		int j = 0;
		//one foreach per data structure
		for(double each : arr1){
			arr3[j++] = each;
		}

		for (double each : arr2) {
			arr3[j++] = each;
		}
		return arr3;
	}

	public static String[] merge(String[] arr1, String[] arr2){
		String[] arr3 = new String[arr1.length + arr2.length];
		int j = 0;
		//one foreach per data structure
		for(String each : arr1){
			arr3[j++] = each;
		}

		for (String each : arr2) {
			arr3[j++] = each;
		}
		return arr3;
	}

	public static char[] merge(char[] arr1, char[] arr2){
		char[] arr3 = new char[arr1.length + arr2.length];
		int j = 0;
		//one foreach per data structure
		for(char each : arr1){
			arr3[j++] = each;
		}

		for (char each : arr2) {
			arr3[j++] = each;
		}
		return arr3;
	}
}