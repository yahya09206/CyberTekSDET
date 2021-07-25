import java.util.Arrays;
public class WarmupTask3 {
	public static void main(String[] args){

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
	public static double frequency(double[] array, double element){
		int count = 0;
		for (double each : array) {
			if (each == element) {
				count++;
			}
		}
		return count;
	}

	//method to find frequency of int inside of array
	public static String frequency(String[] array, String element){
		int count = 0;
		for (String each : array) {
			if (each.equals(element)) {
				count++;
			}
		}
		return count;
	}

	//method to find frequency of int inside of array
	public static char frequency(char[] array, char element){
		int count = 0;
		for (char each : array) {
			if (each == element) {
				count++;
			}
		}
		return count;
	}
}