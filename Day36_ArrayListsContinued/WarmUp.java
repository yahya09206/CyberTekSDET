import java.util.ArrayList;
import java.util.Arrays;
public class WarmUp {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

		System.out.println(list);
		//list.set() to get last element
		list.set(list.size() - 1, 0);
		System.out.println(list);
		System.out.println("-------------------------------------");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

		System.out.println(list2);

		//loop thru list and multiply odd by 2
		for (int i = 0; i < list2.size(); i++) {//index numbers of list
			if (list2.get(i) % 2 != 0) { //if the element is odd number
				list2.set(i, list2.get(i) * 2);//multiply odd number by 2
			}
		}
		System.out.println(list2);

		System.out.println("-------------------------------------");
		//program to combine two string arrays
		String[] arr1 = {"A", "B", "C"}, arr2 = {"D", "E", "F", "G"};
		//ArrayList to store values
		ArrayList<String> result = new ArrayList<>(Arrays.asList(arr1));
		result.addAll(Arrays.asList(arr2));
		//go thru elements one by one
		// for (String each : arr1) {
		// 	 result.add(each);
		// }
	 // 	for (String each : arr2) {
		// 	result.add(each);
		// }
		System.out.println(result);
	}
}