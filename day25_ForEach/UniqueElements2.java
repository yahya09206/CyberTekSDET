package day25_ForEach;

public class UniqueElements2 {
	public static void main(String[] args){

		char[] chars = {'A', 'B', 'A', 'C', 'A', 'D', 'D'};

		for (char characters : chars) {

			int count = 0;

			for (char each : chars) {
				if (each == characters) {
					count++;
				}
			}
			if (count == 1){
				System.out.println(characters);
			}
		}
	}
}