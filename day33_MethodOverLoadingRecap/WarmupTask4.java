import utilities.ArraysUtilities;
import java.util.Arrays;
public class WarmupTask4 {
	public static void main(String[] args){
		String str = "aaabbbbbbcc";
		String result = "";
		for (int i = 0; i < str.length() - 1; i++) {
			char each = str.charAt(i);
			if (!result.contains("" + each)) {
				result += each;
			}
		}
		System.out.println(result);

		System.out.println("---------------------------------");
		int[] array = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5,5,5};
		int[] r1 = removeDup(array);
		System.out.println(Arrays.toString(r1));
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