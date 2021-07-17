import java.util.Arrays;
public class ReturnMethodsPractice {
	public static void main(String[] args){

	}

	public static int max(int a, int b){
		int max = 0;
		if(a > b){
			max = a;
		}else {
			max = b;
		}
		return max;
	}
}