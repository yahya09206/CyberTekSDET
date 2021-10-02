package day27_Recap;

public class FirstUniqueElement {
	public static void main(String[] args){

		int[] arr = {1,1,2,3,3,4};
		int firstUniqueElement = 0;

		for (int j = 0; j < arr.length; j++){
			int count = 0;
			for (int i = 0; i < arr.length; i++){
				if (arr[i] == arr[j]){
					count++;
				}
			}
			if (count == 1){
				firstUniqueElement = arr[j];
				break;
			}
		}
		System.out.println("firstUniqueElement = " + firstUniqueElement);
	}
}