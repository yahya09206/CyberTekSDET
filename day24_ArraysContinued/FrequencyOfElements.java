package day24_ArraysContinued;

public class FrequencyOfElements {
	public static void main(String[] args){

		//int[] arr = {1, 1, 2, 3, 3, 4};
		String[] arr = {"apple", "bat", "apple", "car"};

		for (int j = 0; j <= arr.length - 1; j++) {
			String element = arr[j];
			int count = 0;
			for (int i = 0; i <= arr.length - 1; i++) {
				if (arr[i].toLowerCase().trim() == element) {
					count++;
				}
			}
			System.out.println(element + " " + count);
		}
//		for (int j = 0; j < arr.length; j++) {
//			String element = arr[j];
//			int count = 0;
//			for (int i = 0; i <= arr.length - 1; i++) {
//				if (arr[i] == element) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.println(element + " " + count);
//			}
//		}
	}
}
