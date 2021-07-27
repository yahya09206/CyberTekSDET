import java.util.ArrayList;
import java.util.Arrays;
public class ArraysListIntro {
	public static void main(String[] args){
		int[] nums = new int[10];//fixed size of 10
		System.out.println(Arrays.toString(nums));
		System.out.println("--------------------------");
		//ArrayList declaration
		ArrayList<Integer> numbers = new ArrayList<>();//size is 0
		//add to arraylist. List will expand
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(1, 15);
		numbers.add(20);
		System.out.println(numbers);
		//get index from array list using .get() method
		System.out.println(numbers.get(2));

		//loop thru array
		System.out.println(numbers.size());

	}
}