import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		// while(true){
		// 	System.out.println("Enter a number: ");
		// 	int num = scan.nextInt();

		// 	if(n < 0){
		// 		break; //exits loop
		// 	}

		// 	sum += n;
		// }
		// System.out.println("Sum = " sum);

		while(n >= 0){
			System.out.println("Enter a number: ");
			int num = scan.nextInt();

			sum += n;
		}
		System.out.println("Sum = " sum);
	}
}