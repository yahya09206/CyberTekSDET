package day21_WhileDoWhile;

public class WhileLoopPractice2 {
	public static void main(String[] args){

		int num = 1;
		while (num <= 10){

			if (num % 2 == 0){
				System.out.print(num + " ");
			}

			num++;
		}
		System.out.println();
	}
}