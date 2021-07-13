import java.util.Arrays;
public class ForEachLoopIntro {
	public static void main(String[] args){

		int[] numbers = {1,2,3,4,5};

		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}

		System.out.println("----------------------------");
		//For each loop already does the iteration for you that starts from 0 to last index(fixed). can't use to reverse values. can only use with data structures
		for (int i : numbers ) {
			System.out.print(i);
		}

		System.out.println("----------------------------");
		//Print names
		String[] names = {"James", "Mike", "Rochelle", "Ashley", "Robyn"};

		for (String name : names) {
			System.out.println(name);
		}

	}
}