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
		list.addAll(Arrays.asList(10,11,12,13,14,15));
		System.out.println(list);

		System.out.println("---------------------------------");
		//removeAll() will find specific elements to remove all instances of
		ArrayList<String> students = new ArrayList<>();
		students.addAll(Arrays.asList("Dilem", "Philipp", "Abbos", "Atila", "Ekaterina"));
		System.out.println(students);
		students.removeAll(Arrays.asList("Dilem", "Philipp", "Abbos"));
		System.out.println(students);

		ArrayList<Integer> nums = new ArrayList<>();
		nums.addAll(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,3,4,5,6,7,8,9,1,1,1,1,1,1,1));
		System.out.println(nums);
		//remove specific num(s)
		//nums.removeAll(Arrays.asList(1));
		//remove elements that don't match with specific num
		nums.retainAll(Arrays.asList(1));
		System.out.println(nums);

		System.out.println("---------------------------------");
		ArrayList<String> employees = new ArrayList<>();
		employees.addAll(Arrays.asList("Dilem", "Philipp", "Abbos", "Ahmet", "Andrei", "Gabil", "Aliya", "Atila"));
		System.out.println(employees);
		employees.retainAll(Arrays.asList("Ahmet", "Andrei"));
		System.out.println(employees);


	}
}