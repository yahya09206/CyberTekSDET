import java.util.Arrays;
public class MultiDimensionalArray1 {
	public static void main(String[] args){

		int[][] arr2D = {{1,2,3},{4,5},{6,7,8}};
		System.out.println(arr2D.length);

		System.out.println(Arrays.toString(arr2D[1]));
		System.out.println(Arrays.deepToString(arr2D));
	}
}