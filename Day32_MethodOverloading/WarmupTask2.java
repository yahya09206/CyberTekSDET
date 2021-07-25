import java.util.Arrays;
public class WarmupTask2 {
	public static void main(String[] args){

		int[] array = {1,2,3,4,5,6,7,8,9};
		int element = 10;
		System.out.println(Arrays.toString(array));
		array = addInteger(array, element);
		System.out.println(Arrays.toString(array));
		System.out.println("--------------------------------");
		double[] array2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		double element2 = 10.0;
		System.out.println(Arrays.toString(array2));
		array2 = addDouble(array2, element2);
		System.out.println(Arrays.toString(array2));
		System.out.println("--------------------------------");
		String[] array3 = {"hit", "lit"};
		String element3 = "bit";
		System.out.println(Arrays.toString(array3));
		array3 = addString(array3, element3);
		System.out.println(Arrays.toString(array3));
		System.out.println("--------------------------------");
		char[] array4 = {'A', 'B'};
		array4 = addChar(array4, 'C');
		System.out.println(Arrays.toString(array4));


	}
	//method to add integer to end of array
	public static int[] addInteger(int[] array, int number){

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
	public static double[] addDouble(double[] array, double number){
		int i = 0;
		double[] result = new double[array.length + 1];
		for (double each : array ) {
			result[i++] = each;
		}
		result[i] = number;
		return result;
	}

	//method to add string to end of array
	public static String[] addString(String[] array, String str){
		int i = 0;
		String[] result = new String[array.length + 1];
		for (String each : array) {
			result[i++] = each;
		}
		result[i] = str;
		return result;
	}

	//method to add char to array
	public static char[] addChar(char[] array, char ch){
		 char[] result = Arrays.copyOf(array, array.length + 1);
		 result[result.length - 1] = ch;
		 return result;
	}
	//------------------Method Overloading--------------------------
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
}