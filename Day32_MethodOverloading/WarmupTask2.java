import java.util.Arrays;
public class WarmupTask2 {
	public static void main(String[] args){

		int[] array = {1,2,3,4,5,6,7,8,9};
		int element = 10;
		System.out.println(Arrays.toString(array));
		array = addInteger(array, element);
		System.out.println(Arrays.toString(array));

		double[] array2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		double element2 = 10.0;
		System.out.println(Arrays.toString(array2));
		array2 = addDouble(array2, element2);
		System.out.println(Arrays.toString(array2));


	}

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


}