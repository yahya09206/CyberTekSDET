import java.util.Arrays;
public class ArraysReview {
	public static void main(String[] args){
		//variable of strings
		String item = "Eggs",
			   item2 = "Milk",
			   item3 = "Apple",
			   item4 = "Chicken",
			   item5 = "Papers";
		//declare array of 10 items
		String[] items = new String[10];
		items[3] = "Milk";
		items[3] = "Paper towels";
		//items[10] = "Grape";

		System.out.println(Arrays.toString(items));

		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(numbers));

		//loop thru array
		for (int i = 0; i <= numbers.length - 1; i++) {
			System.out.println(numbers[i]);
		}
	}
}