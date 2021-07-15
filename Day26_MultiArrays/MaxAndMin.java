import java.util.Arrays;
public class MaxAndMin {
	public static void main(String[] args){

		int[][] numbers = {{10,20,30}, {40,50,60,70,80}};

		int max = int[0][0];

		for (int[] each1D : numbers ) {//reps each of the 1d array in 2d array
			for (int element : each1D ) {
				if (element > max) {
					max = element;
				}
				if (element < min) {
					min = element;
				}
			}
		}
		System.out.println("---------------------------------");
	}
}