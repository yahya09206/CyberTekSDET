public class LoopsReview {
	public static void main(String[] args){
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println("-----------------------------------");

		//using for loop
		for(int i = 1; i < 11; i++){
			System.out.print(i + " ");	
		}
		System.out.println();

		System.out.println("-----------------------------------");
		//print only even numbers from 1-20
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		String str = "Java";
		
	}
}