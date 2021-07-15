import java.util.Arrays;
public class MaxAndMin {
	public static void main(String[] args){

		int[][] numbers = {{10,20,30}, {40,50,60,70,80}};

		int max = numbers[0][0];
		int min = numbers[0][0];
		int sum = 0;

		for (int[] each1D : numbers ) {//reps each of the 1d array in 2d array
			for (int element : each1D ) {
				sum += element;
				if (element > max) {
					max = element;
				}
				if (element < min) {
					min = element;
				}
			}
		}
		System.out.println("max " + max);
		System.out.println("min " + min);
		System.out.println("sum " + sum);
		System.out.println("---------------------------------");
	}
}