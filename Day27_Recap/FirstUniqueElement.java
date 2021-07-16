import java.util.Arrays;
public class FirstUniqueElement {
	public static void main(String[] args){

		int[] nums = {1,1,2,3,3,4};
		int firstUniqueElement = 0;

		//outer loop
		// for (int j = 0; j < nums.length; j++) {//repeat inner loop to find frequency for all elements
		// 	//iterate thru loop
		// 	int frequency = 0;
		// 	for (int i = 0; i < nums.length; i++) { //find frequency of one element
		// 		if (nums[i] == nums[j]) {
		// 			frequency++;	
		// 		}
		// 	}
		// 	//check if frequency = 1
		// 	if (frequency == 1) {
		// 		firstUniqueElement = nums[j]; 
		// 		//exit loop after finding first uniqe element 
		// 		break;
		// 	}
		// }

		//using for each loop
		//outer loop
		for (int each : nums) {//repeat inner loop to find frequency for all elements
			//iterate thru loop
			int frequency = 0;
			for (int elements : nums) { //find frequency of one element
				if (nums[i] == nums[j]) {
					frequency++;	
				}
			}
			//check if frequency = 1
			if (frequency == 1) {
				firstUniqueElement = nums[j]; 
				//exit loop after finding first uniqe element 
				break;
			}
		}
		System.out.println(firstUniqueElement);
	}
}