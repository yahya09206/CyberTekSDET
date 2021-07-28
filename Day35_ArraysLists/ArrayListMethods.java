import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListMethods {
	public static void main(String[] args){
		//init AL and add elements to it
		ArrayList<String> groceryList = new ArrayList<>();
		groceryList.add("Eggs");
		groceryList.add("Milk");
		groceryList.add("Water");
		groceryList.add("Vinegar");
		groceryList.add("Bread");
		System.out.println(groceryList);
		groceryList.set(0, "Toilet Paper");
		groceryList.set(3, "Soda");
		System.out.println(groceryList);

		System.out.println("--------------------------------");
		//remove element using remove() method
		groceryList.remove(1);
		System.out.println(groceryList);
		//remove using object
		groceryList.remove("Water");
		System.out.println(groceryList);
		System.out.println("--------------------------------");
		//new list of integers
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		//remove specific index
		//Integer a = 30;
		//list1.remove(Integer.valueOf(30));
		list1.remove((Integer)30);
		System.out.println(list1);
		groceryList.clear();
		System.out.println(groceryList);
		boolean hasToiletPaper = groceryList.contains("Toilet Paper");

		System.out.println("--------------------------------");
		ArrayList<Character> list = new ArrayList<>();
		list.add('A');
		list.add('A');
		list.add('A');
		list.add('B');
		list.add('A');
		list.add('D');
		list.add('C');
		System.out.println(list);
		list.indexOf('A');
		list.lastIndexOf('A');

		//new list for unique characters
		ArrayList<Character> uniqueChars = new ArrayList<>();
		for (Character each : list) {
			//check if elements match
			if (list.indexOf(each) == list.lastIndexOf(each)) {
				//add to unique chars arraylist
				uniqueChars.add(each);
			}
		}
		System.out.println("uniqueChars = " + uniqueChars);

		System.out.println("-----------------------------------------");
		//remove duplicates
		ArrayList<Character> characters = new ArrayList<>();
		characters.add('A');
		characters.add('A');
		characters.add('A');
		characters.add('B');
		characters.add('A');
		characters.add('C');
		characters.add('C');
		System.out.println(characters);

	}
}