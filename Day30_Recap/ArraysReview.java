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
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		//reverse array and put into 2nd array
		int[] nums = {10,20,30,40,50};
		int[] result = new int[nums.length];
		for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] += nums[i];
		}
		System.out.println(Arrays.toString(result));

		System.out.println();
		System.out.println("----------------------------------");
		//merge arrays
		String[] group1 = {"Sophie", "Feruza", "Ekaterina"};
		String[] group2 = {"Shazia", "Bilguun", "Danka", "Mucahit"};

		//array to store group1 and 2 values
		String[] group3 = new String[group1.length + group2.length];

		//variable to keep track of index
		int k = 0;
		//use for loop to loop
		for (int i = 0; i <= group1.length - 1; i++) {
			group3[k++] = group1[i];
		}

		for (int j = 0; j <= group2.length - 1; j++) {
			group3[k++] = group2[j];
		}

		System.out.println(Arrays.toString(group3));

	}
}