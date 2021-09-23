import java.util.Arrays;
public class MultiDimensionalArrayPractice {
	public static void main(String[] args){

		int[][] arr2D = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};

		//iterate thru whole array from right to left
		for (int i = arr2D.length - 1; i >= 0; i--) {
			//iterate thru inner arrays
			for (int j = 0; j < arr2D[i].length; j++) { //j = each element index
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		//Reverse starting from first array inside of 2d
		//iterate thru whole array from right to left
		for (int i = 0; i < arr2D.length; i++) {
			//iterate thru inner arrays
			for (int j = arr2D[i].length - 1; j >= 0; j--) { //j = each element index
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------------------");
		for (int[] each1D: arr2D) {
			//iterate thru inner arrays
			for (int j = each1D.length - 1; j >= 0; j--) { //j = each element index
				System.out.print(each1D[j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------------------");
		for(int i = arr2D.length - 1; i >= 0; i--){
			for (int j = arr2D[i].length - 1; j >= 0; j--) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}
	}
}