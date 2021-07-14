import java.util.Arrays;
public class MultiDimensionalArray2 {
	public static void main(String[] args){

		int[][][] arr3D = { {{1,2,3}, {4,5}}, {{6,7,8},{9,10}} };

		System.out.println(Arrays.deepToString(arr3D));
		System.out.println(Arrays.deepToString(arr3D[1]));
		System.out.println(Arrays.toString(arr3D[0][1]));
		//Print specific element from last index
		System.out.println(arr3D[1][0][2]);

		System.out.println("----------------------------------------");
		//print out every single element using for each
		//for getting each 2 dimensional arrayb from array variable
		for (int[][] each2D : arr3D) {
			//for getting 1 dimensional array from 2d array
			for (int[] each1D : each2D ) {
				//for getting each element from each single dimensional array
				for (int element : each1D ) {
					System.out.print(element + " ");
				}
				System.out.println();
			}
		}

	}
}