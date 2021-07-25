import utilities.ArraysUtilities;
import java.util.Arrays;
public class WarmupTask1 {
	public static void main(String[] args){

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
}