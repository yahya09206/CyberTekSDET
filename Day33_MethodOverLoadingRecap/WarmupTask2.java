import java.util.Arrays;
public class WarmupTask2 {
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8};
		boolean r1 = contains(array, 10);
		System.out.println(r1);
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

	//check if array contains certain element of an int
	public static boolean contains(String[] array, String element){
		boolean result = false;
		for (String each : array) {
			if (each.equals(element)) {
				return true;
			}
		}
		return false;
	}

	//check if array contains certain element of an int
	public static boolean contains(double[] array, double element){
		boolean result = false;
		for (double each : array) {
			if (each == element) {
				return true;
			}
		}
		return false;
	}

	//check if array contains certain element of an int
	public static boolean contains(char[] array, char element){
		boolean result = false;
		for (char each : array) {
			if (each == element) {
				return true;
			}
		}
		return false;
	}
}