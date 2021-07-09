public class VoidMethodPractice {
	public static void main(String[] args){

		printOddNumbers(1, 150);
	}

	public static void printOddNumbers(int from, int to){
		for(int i = from; i <= to; i++){
			if(i % 2 != 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}