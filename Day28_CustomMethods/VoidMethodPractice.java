import java.util.Scanner;
public class VoidMethodPractice {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		printOddNumbers(1, 150);
		printOddNumbers(50, 85);
		printOddNumbers(100, 125);
	}

	public static void printOddNumbers(int from, int to){
		for(int i = from; i <= to; i++){
			if(i % 2 != 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void printEvenNumbers(int from, int to){
		
	}
}