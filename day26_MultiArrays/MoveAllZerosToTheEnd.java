import java.util.Arrays;
public class MoveAllZerosToTheEnd {
	public static void main(String[] args){

		int[] array = {10,0,5,0,1,0};
		int[] result = new int[array.length];

		//int i = 0;
		// for(int each : array){
		// 	if(each != 0){
		// 		result[i++] = each;
		// 	}
		// }
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] != 0) {
				result[j++] = array[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}