import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		int[] reversedArray = new int[array.length];

		for(int i = array.length-1; i >= 0; i--){
			System.out.println(array[i]);
		}
	}
}