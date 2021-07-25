import utilities.ArraysUtilities;
import java.util.Arrays;
public class WarmupTask3 {
	public static void main(String[] args){
		int[] array = {1,1,1,2,3,3,4,5,5,6};
		//System.out.println(Arrays.toString(result));
		System.out.println("--------------------------------");
		int[] array2 = {100,200,100,200,300,400,500,600,600};
		int[] r1 = unique(array2);
		System.out.println(Arrays.toString(r1));
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

	//method to return unique elements from int array
	public static double[] unique(double[] array){
		double[] result = {};

		for (double each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}

	//method to return unique elements from int array
	public static String[] unique(String[] array){
		String[] result = {};

		for (String each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}

	//method to return unique elements from int array
	public static char[] unique(char[] array){
		char[] result = {};

		for (char each : array) {//getting each element
			if (frequency(array, each) == 1) {//call frequency method to check how many times an eelement shows up
				result = ArraysUtilities.addElement(result, each);//call addelement method from arrays utilities to add to new array
			}
		}
		return result;
	}
}