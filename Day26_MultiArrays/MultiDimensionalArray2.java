import java.util.Arrays;
public class MultiDimensionalArray2 {
	public static void main(String[] args){

		int[][][] arr3D = { {{1,2,3}, {4,5}}, {{6,7,8},{9,10}} };

		System.out.println(Arrays.deepToString(arr3D));
		System.out.println(Arrays.deepToString(arr3D[1]));

	}
}