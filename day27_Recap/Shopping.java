import java.util.Arrays;
public class Shopping {
	public static void main(String[] args){

		String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 12 case"};
		double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
		int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

		//1. find out the first index of gloves
		for (int i = 0; i < items.length; i++) {
			if (items[i].equals("Gloves")) {
				System.out.println(i);
				break;
			}
		}

		//2. find out if ipad is contained in item list
		boolean hasIpad = false;
		for (String eachItem : items) {
			if (eachItem.equals("iPad")) {
				hasIpad = true;
			}
		}
		System.out.print("hasIpad = " + hasIpad);

		System.out.println("-------------------------------------");
		//3. print a report of each shopping item
		for (int i = 0; i < itemIDs.length; i++) {
			System.out.println(items[i] + " $" + prices[i] + " ID#" + itemIDs[i]);
		}
	}
}