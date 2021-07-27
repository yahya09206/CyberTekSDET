import java.util.ArrayList;
import java.util.Arrays;
public class ArraysListIntro {
	public static void main(String[] args){
		int[] nums = new int[10];//fixed size of 10
		System.out.println(Arrays.toString(nums));
		//ArrayList declaration
		ArrayList<Integer> numbers = new ArrayList<>();//size is 0
		//add to arraylist
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);

	}
}