import java.util.Arrays;
public class CommonElements {
	public static void main(String[] args){

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7,8,9,10,11};

		//iterate thru first array
		for (int each : arr1 ) {
			if (each == 4) {
				System.out.println(each);
			}
		}
	}
}