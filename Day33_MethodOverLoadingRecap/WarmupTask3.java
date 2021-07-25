import utilities.ArraysUtilities;
import java.util.Arrays;
public class WarmupTask3 {
	public static void main(String[] args){
		int[] array = {1,1,1,2,3,3,4,5,5,6};
		int[] result = {};

		for (int each : array) {
			if (frequency(array, each) == 1) {
				result = ArraysUtilities.addElement(result, each);
			}
		}
		System.out.println(Arrays.toString(result));
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
}