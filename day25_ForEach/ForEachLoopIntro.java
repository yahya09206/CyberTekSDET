package day25_ForEach;

public class ForEachLoopIntro {
	public static void main(String[] args){

		int[] numbers = {1,2,3,4,5};

		// old way
		for(int i = 0; i <= numbers.length - 1; i++){
			System.out.print(numbers[i]);
		}

		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println("----------------------------------------");
		String[] names = {"Ahmet", "Boburbek", "Farid", "Robinson"};

		for (String each : names) {
			System.out.println(each);
		}
	}
}