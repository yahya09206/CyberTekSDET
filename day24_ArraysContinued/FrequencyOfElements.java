package day24_ArraysContinued;

public class FrequencyOfElements {
	public static void main(String[] args){

		int[] arr = {1,1,2,3,3,4};

		for (int j = 0; j <= arr.length - 1; j++) {
			int element = arr[j];
			int count = 0;

			for (int i = 0; i <= arr.length - 1 ; i++) {
				// compare element to current index
				if (element == arr[i]){
					count++;
				}
			}

			if (count == 1){ // check if element is unique
				System.out.print(element + " ");
			}
		}
	}
}