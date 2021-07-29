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
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) % != 0) {
				
			}
		}

	}
}