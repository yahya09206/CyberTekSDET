import java.util.Arrays;
public class ReturnMethodsPractice {
	public static void main(String[] args){

		int maxNum = max(10, 20);
		System.out.println(maxNum * 2);
		System.out.println("---------------------------------");
		int[] numbers = {10,5,0,-1,20,8,7};
		int max = numbers[0];
		int min = numbers[0];
		for (int each : numbers) {
			max = max(each, max);
			min = min(each, min);
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

	public static int max(int a, int b){
		// int max = 0;
		// if(a > b){
		// 	max = a;
		// }else {
		// 	max = b;
		// }
		// return max;
		return (a > b)? a : b;
	}
	public static int min(int a, int b){
		return (a < b)? a : b;
	}
	public static int maxNumberFromIntArray()
}