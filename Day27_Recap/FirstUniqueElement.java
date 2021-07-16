import java.util.Arrays;
public class FirstUniqueElement {
	public static void main(String[] args){

		int[] nums = {1,1,2,3,3,4};
		int firstUniqueElement = 0;

		//iterate thru loop
		int frequency = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				frequency++;	
			}
		}
		System.out.println(frequency);
	}
}