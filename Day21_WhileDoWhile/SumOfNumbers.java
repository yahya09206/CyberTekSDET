import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("Enter a number: ");
			int num = scan.nextInt();

			if(n < 0){
				break; //exits loop
			}

			sum += n;
		}
		System.out.println("Sum = " sum);
	}
}