package day25_ForEach;

public class UniqueElements {
	public static void main(String[] args){

		String[] arr = {"java", "java", "python", "c#"};

		for (String each : arr) {

			int count = 0;

			for (String word : arr) {
				if (word.equals(each)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(each);
			}
		}
	}
}