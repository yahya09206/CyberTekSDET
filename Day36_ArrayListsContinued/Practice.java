import utilities.StringUtility;
import java.util.ArrayList;
import java.util.Arrays;
public class Practice {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,7,7,7,8,8));
		//loop to remove
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				list.remove(i);
			}
		}
		System.out.println(list);
		System.out.println("------------------------------");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,7,7,7,8,8));
		//p represent each element in list then give condition
		//list2.removeIf(p -> p < 5);
		list2.removeIf(each -> each % 2 != 0);
		System.out.println(list2);

		System.out.println("------------------------------");
		ArrayList<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Ahmad", "Merve", "Feruza", "Said", "Komiljon", "Selda", "Fhilipp"));
		//remove all names that contain 'a';
		names.removeIf(p -> p.toLowerCase().contains("a"));
		System.out.println(names);

		System.out.println("------------------------------");
		//remove all names that are palindromes
		ArrayList<String> names2 = new ArrayList<>();
		words.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Python", "Cybertek", "Sabas", "Pop", "Kayak"));
		words.removeIf(p -> StringUtility.isPalindrome(p));

	}
}