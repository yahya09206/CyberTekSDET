import java.util.Arrays;
public class ForEachLoop {
	public static void main(String[] args){
		int[] numbers = {100,200,300,400,500};

		for(int each : numbers){
			System.out.println(each);
		}

		System.out.println("-------------------------");
		//find max number from array
		int max = numbers[0];
		int min = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}//use math.max method to find max
			max = Math.max(number, max);
			min = Math.min(number, min);
		}
		System.out.println(max);
		System.out.println(min);
	}
}