package day25_ForEach;

public class ForEachLoopIntro {
	public static void main(String[] args){

		int[] numbers = {1,2,3,4,5};

		for (int i = 0; i <= numbers.length - 1; i++) {
			System.out.println("numbers[i] = " + numbers[i]);
		}

		System.out.println("---------------------------------------------");

		for (int each : numbers){
			System.out.println(each);
		}
	}
}