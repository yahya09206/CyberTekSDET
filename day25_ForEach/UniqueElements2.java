package day25_ForEach;

public class UniqueElements2 {
	public static void main(String[] args){

		char[] chars = {'A', 'B', 'A', 'C', 'A', 'D', 'D'};

		for (char each : chars){
			int count = 0;
			for (char eachs : chars) {
				if (each == eachs){
					count++;
				}
			}
			if (count == 1){
				System.out.println(each);
			}
		}
	}
}