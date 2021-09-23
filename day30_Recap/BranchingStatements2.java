public class BranchingStatements2 {
	public static void main(String[] args){

		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				//break after i = 3
				//break;//only exits loop
				//return;//exits whole method
				continue;//exits current iteration, will skip 3
			}
			System.out.println(i);
		}
		System.out.println("Hello Everyone");
	}
}