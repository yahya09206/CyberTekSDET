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



	}
}