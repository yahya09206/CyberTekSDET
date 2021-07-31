import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionUtility {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(10,10,5,0,-1,30,40,15));

		//sort
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		//swap
		Collections.swap(list, 0, 2);
		System.out.println(list);

		Collections.replaceAll(list, 10, 20);
		System.out.println(list);

		//find frequency
		int f = Collections.frequency(list, 20);
		System.out.println(f);

		System.out.println("------------------------------------");
		ArrayList<Character> chars = new ArrayList<>();
		chars.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D'));

		//store uniques in new Al
		// ArrayList<Character> uniques = new ArrayList<>();
		// //loop thru and check
		// for (Character each: chars ) {
		// 	if (Collections.frequency(chars, each) == 1) {
		// 		uniques.add(each);
		// 	}
		// }
		//Remove elements that are not = 1
		ArrayList<Character> uniques = new ArrayList<>(chars);
		uniques.removeIf(p -> Collections.frequency(uniques, p) != 1);
		System.out.println(uniques);

	}
}