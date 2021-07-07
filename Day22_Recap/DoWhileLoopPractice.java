public class DoWhileLoopPractice {
	public static void main(String[] args){

		int i = 0;
		int sum = 0;
		do {
			if(i % 2 == 0){
				sum += i;
			}
			System.out.println(i);
			i++;
		}while(i <= 10);
	}
}