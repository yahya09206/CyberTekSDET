package day25_ForEach;

public class UniqueElements2 {
	public static void main(String[] args){

		char[] chars = {'A', 'B', 'A', 'C', 'D', 'D'};


		for (char each : chars) {
			int count = 0;
			for (char character : chars) {
				if (character == each){
					count++;
				}
			}
			if (count == 1){
				System.out.println(each);
			}
		}
	}
}