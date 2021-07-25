import java.util.Arrays;
public class WarmUpTask2 {
	public static void main(String[] args){


	}

	public static int[] addInteger(int[] array, int number){

		int[] result = new int[array.length + 1];
		for (int each : array ) {
			result[i++] = each;
		}
		result[i] = number;
		return result;
	}
}