import utilities.ArraysUtilities;
import java.util.Arrays;
public class WarmupTask1 {
	public static void main(String[] args){

	}
	//method to reverse array and return int
	public static int[] reverse(int[] array){
		int[] result = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			result[i] = array;
		}
		return result;
	}
}