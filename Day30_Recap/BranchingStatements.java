public class BranchingStatements {
	public static void main(String[] args){

		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				//break after i = 3
				//break;
				return;
			}
			System.out.println(i);
		}
	}
}