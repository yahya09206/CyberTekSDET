import java.util.Arrays;
public class ReturnMethodsPractice {
	public static void main(String[] args){

		int maxNum = max(10, 20);
		System.out.println(maxNum * 2);

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
}