import java.util.Arrays;
public class WarmUpTask2 {
	public static void main(String[] args){

		int[] array = {1,2,3,4,5,6,7,8,9};
		int element = 10;
		addInteger(array, element);

	}

	public static int[] addInteger(int[] array, int number){

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
}