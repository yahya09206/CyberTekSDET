import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int max = -2147483647;

		for(int i = 0; i < 5; i++){
			System.out.println("Enter a number: ");
			int n = scan.nextInt(); // 1

			if(n > max){
				max = n;
			}
		}
		System.out.println("max = " + max);
		scan.close();
	}
}