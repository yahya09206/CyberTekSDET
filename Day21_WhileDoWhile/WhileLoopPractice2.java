public class WhileLoopPractice2 {
	public static void main(String[] args){
		int i = 0;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
}