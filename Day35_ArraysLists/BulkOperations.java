import java.util.ArrayList;
import java.util.Arrays;
public class BulkOperations {
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
		//use addAll() to add multiple elements at once
		ArrayList<Integer> list = new ArrayList<>();
		//list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
		list.addAll(numbers);
		System.out.println(list);
	}
}