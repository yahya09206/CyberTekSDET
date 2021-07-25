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

	//method to remove element of int at given index of the array
	public static int[] remove(int[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		int[] result = new int[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}

	//method to remove element of double at given index of the array
	public static double[] remove(double[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		double[] result = new double[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}

	//method to remove element of string at given index of the array
	public static String[] remove(String[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		String[] result = new String[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}

	//method to remove element of string at given index of the array
	public static char[] remove(char[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		char[] result = new char[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index and skip iteration
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}

	//method to reverse array and return int
	public static int[] reverse(int[] array){
		int[] result = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = array[i];
		}
		return result;
	}

	//method to reverse array and return string
	public static String[] reverse(String[] array){
		String[] result = new String[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = array[i];
		}
		return result;
	}

	//method to reverse array and return double
	public static double[] reverse(double[] array){
		double[] result = new double[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = array[i];
		}
		return result;
	}

	//method to reverse array and return char
	public static char[] reverse(char[] array){
		char[] result = new char[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = array[i];
		}
		return result;
	}

	//check if array contains certain element of an int
	public static boolean contains(int[] array, int element){
		boolean result = false;
		for (int each : array) {
			if (each == element) {
				return true;
			}
		}
		return false;
	}

	//check if array contains certain element of a string
	public static boolean contains(String[] array, String element){
		boolean result = false;
		for (String each : array) {
			if (each.equals(element)) {
				return true;
			}
		}
		return false;
	}

	//check if array contains certain element of a double
	public static boolean contains(double[] array, double element){
		boolean result = false;
		for (double each : array) {
			if (each == element) {
				return true;
			}
		}
		return false;
	}

	//check if array contains certain element of a char
	public static boolean contains(char[] array, char element){
		boolean result = false;
		for (char each : array) {
			if (each == element) {
				return true;
			}
		}
		return false;
	}

	//method to find frequency of int inside of array
	public static int frequency(int[] array, int element){
		int count = 0;
		for (int each : array) {
			if (each == element) {
				count++;
			}
		}
		return count;
	}	

	//method to find frequency of int inside of array
	public static int frequency(double[] array, double element){
		int count = 0;
		for (double each : array) {
			if (each == element) {
				count++;
			}
		}
		return count;
	}

	//method to find frequency of int inside of array
	public static int frequency(String[] array, String element){
		int count = 0;
		for (String each : array) {
			if (each.equals(element)) {
				count++;
			}
		}
		return count;
	}

	//method to find frequency of int inside of array
	public static int frequency(char[] array, char element){
		int count = 0;
		for (char each : array) {
			if (each == element) {
				count++;
			}
		}
		return count;
	}

	//method to return unique elements from int array
	public static int[] unique(int[] array){
		int[] result = {};

		for (int each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}

	//method to return unique elements from double array
	public static double[] unique(double[] array){
		double[] result = {};

		for (double each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}

	//method to return unique elements from string array
	public static String[] unique(String[] array){
		String[] result = {};

		for (String each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}

	//method to return unique elements from char array
	public static char[] unique(char[] array){
		char[] result = {};

		for (char each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}

	//method to remove duplicate ints from array
	public static int[] removeDup(int[] array){
		int[] newArr = {};

		for (int each : array) {
			//if element is not contained in new array then add element to array
			if (!ArraysUtilities.contains(newArr, each)) {
				newArr = ArraysUtilities.addElement(newArr, each);
			}
		}
		return newArr;
	}

	//method to remove duplicate ints from array
	public static double[] removeDup (double[] array){
	 double[] newArr = {};

		for  (double each : array) {
			//if element is not contained in new array then add element to array
			if (!ArraysUtilities.contains(newArr, each)) {
				newArr = ArraysUtilities.addElement(newArr, each);
			}
		}
		return newArr;
	}

	//method to remove duplicate ints from array
	public static String[] removeDup(String[] array){
		String[] newArr = {};

		for (String each : array) {
			//if element is not contained in new array then add element to array
			if (!ArraysUtilities.contains(newArr, each)) {
				newArr = ArraysUtilities.addElement(newArr, each);
			}
		}
		return newArr;
	}

	//method to remove duplicate ints from array
	public static char[] removeDup(char[] array){
		char[] newArr = {};

		for (char each : array) {
			//if element is not contained in new array then add element to array
			if (!ArraysUtilities.contains(newArr, each)) {
				newArr = ArraysUtilities.addElement(newArr, each);
			}
		}
		return newArr;
	}
}