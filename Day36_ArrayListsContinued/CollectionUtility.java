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
	}
}