import java.util.Scanner;
public class DoWhileLoopPractice {
	public static void main(String[] args){

		int i = 0;
		int sumOfEven = 0;
		int sumOfOdd = 0;
		do {
			if(i % 2 == 0){
				sumOfEven += i;
			}else {
				sumOfOdd += i;
			}
			i++;
		}while(i <= 10);
		System.out.println("sumOfEven = " + sumOfEven);
		System.out.println("sumOfOdd = " + sumOfOdd);

		System.out.println("----------------------------------");
		Scanner scan = new Scanner(System.in);
		String username = "JohnJames";
		String password = "John123";
		String u = "";
		String p = "";

		do{
			System.out.println("Enter your username:");
			u = scan.next();

			System.out.println("Enter your password:");
			p = scan.next();
		}

	}
}