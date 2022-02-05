package day27_Recap;

public class FirstUniqueElement {
	public static void main(String[] args){

		int[] arr = {1,2,3,1,1,3,3,4,4,4,5,5,5,5,6,6,};
		int firstUniqueElement = 0;

		for (int j = 0; j < arr.length; j++) {
			int frequency = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr[j]) {
					frequency++;
				}
			}
			if (frequency == 1){
				firstUniqueElement = arr[j];
				break;
			}
		}
		System.out.println(firstUniqueElement);
	}
}