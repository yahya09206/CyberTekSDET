import java.util.Arrays;
public class ForEachLoopPractice {
	public static void main(String[] args){

		String[] arr1 = {"A", "B", "C", "D"},
				 arr2 = {"E", "F"};
		String[] arr3 = new String[arr1.length + arr2.length];

		int j = 0;
		//one foreach per data structure
		for(String each : arr1){
			arr3[j++] = each;
		}

		for (String each : arr2) {
			arr3[j++] = each;
		}

		System.out.println(Arrays.toString(arr3));
		System.out.println("----------------------------");
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int countOdd = 0,
			countEven = 0;
	}
}