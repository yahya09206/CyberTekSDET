public class BranchingStatements {
	public static void main(String[] args){

		for(int i = 0; i <= 5; i++){
			System.out.println(i);
		}

		for(int i = 0; i <= 10; i++){
			if(i % 2 == 0){
				continue;
			}
				System.out.print(i + " ");
		}
	}
}